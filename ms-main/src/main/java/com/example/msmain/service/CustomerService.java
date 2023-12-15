package com.example.msmain.service;

import com.example.msmain.mapper.CustomerMapper;
import com.example.msmain.model.dto.CustomerCreateRequestDto;
import com.example.msmain.model.dto.CustomerDto;
import com.example.msmain.model.dto.CustomerSearchDto;
import com.example.msmain.model.dto.CustomerUpdateRequestDto;
import com.example.msmain.model.entity.Customer;
import com.example.msmain.repository.CustomerRepository;
import com.example.msmain.specification.SearchCustomerCriteria;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Pageable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.Predicate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final ModelMapper modelMapper;
    private final KafkaTemplate<String, CustomerDto> kafkaTemplate;


    @Transactional(readOnly = true)
    public List<CustomerSearchDto> search(SearchCustomerCriteria searchCustomerCriteria, Pageable pageable) {
        return customerRepository.findAll((root, query, builder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(Objects.nonNull(searchCustomerCriteria.getName())){
                predicates.add(builder.equal(root.get("name"), searchCustomerCriteria.getName()));
            }

            if(Objects.nonNull(searchCustomerCriteria.getCompanyName())){
                predicates.add(builder.equal(root.join("company").get("name"),
                    searchCustomerCriteria.getCompanyName()));
            }

            return  builder.or(predicates.toArray(new Predicate[0]));
            }, pageable
        ).stream().map(item ->
            customerMapper.mapToCustomeSearchDto(item)
        ).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public CustomerDto getById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow();

        return customerMapper.mapToCustomerDto(customer);
    }

    @Override
    @Transactional
    public CustomerDto update(CustomerUpdateRequestDto customerUpdateRequest) {
        Customer customerFromDb = customerRepository.findById(customerUpdateRequest.getId()).orElseThrow();

        Customer customer = modelMapper.map(customerUpdateRequest.getCustomer(), Customer.class);
        customer.setId(customerFromDb.getId());
        customer.setCompany(customerFromDb.getCompany());

        return modelMapper.map(customerRepository.save(customer), CustomerDto.class);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        try {
            customerRepository.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            throw new RuntimeException(String.format("Entry with id %s not found", id), ex);
        }
    }

    @Override
    @Transactional
    public CustomerDto create(CustomerCreateRequestDto customerCreateRequestDto) {
        Customer customer = modelMapper.map(customerCreateRequestDto, Customer.class);

        CustomerDto customerDto = modelMapper.map(customerRepository.save(customer), CustomerDto.class);
        kafkaTemplate.send("ms-kafka", "key " + LocalDateTime.now(), customerDto);

        return customerDto;
    }
}
