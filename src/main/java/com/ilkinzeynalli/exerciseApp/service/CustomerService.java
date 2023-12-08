package com.ilkinzeynalli.exerciseApp.service;

import com.ilkinzeynalli.exerciseApp.mapper.CustomerMapper;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerRequestDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerResponseDto;
import com.ilkinzeynalli.exerciseApp.model.entity.Customer;
import com.ilkinzeynalli.exerciseApp.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public CustomerResponseDto create(CustomerRequestDto customerRequestDto) {
        Customer customer = modelMapper.map(customerRequestDto, Customer.class);

        CustomerResponseDto responseDto = modelMapper.map(customerRepository.save(customer), CustomerResponseDto.class);
        return responseDto;
    }

    @Transactional(readOnly = true)
    public List<CustomerDto> getAll() {
        return customerMapper.mapToCustomerDtoList(customerRepository.findAll());
    }
}
