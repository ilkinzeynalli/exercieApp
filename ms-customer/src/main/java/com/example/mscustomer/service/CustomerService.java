package com.example.mscustomer.service;

import com.example.mscustomer.model.dto.CustomerCreateRequestDto;
import com.example.mscustomer.model.dto.CustomerDto;
import com.example.mscustomer.model.entity.Customer;
import com.example.mscustomer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public CustomerDto create(CustomerDto customerDto) {
        Customer customer = modelMapper.map(customerDto, Customer.class);

        CustomerDto customerMapped = modelMapper.map(customerRepository.save(customer), CustomerDto.class);

        return customerMapped;
    }
}
