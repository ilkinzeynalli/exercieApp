package com.ilkinzeynalli.exerciseApp.service;

import com.ilkinzeynalli.exerciseApp.mapper.CustomerMapper;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Transactional(readOnly = true)
    public List<CustomerDto> getAll() {
        return customerMapper.mapToCustomerDtos(customerRepository.findAll());
    }
}
