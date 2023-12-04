package com.ilkinzeynalli.exerciseApp.service;

import com.ilkinzeynalli.exerciseApp.model.Customer;
import com.ilkinzeynalli.exerciseApp.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService{

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
