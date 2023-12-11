package com.ilkinzeynalli.exerciseapp.service;

import com.ilkinzeynalli.exerciseapp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerSearchDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerCreateRequestDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerUpdateRequestDto;

import java.awt.print.Pageable;
import java.util.List;

public interface ICustomerService {

    List<CustomerSearchDto> search(Pageable pageable);

    CustomerDto create(CustomerCreateRequestDto customerCreateRequestDto);

    CustomerDto getById(Long id);

    CustomerDto update(CustomerUpdateRequestDto customerUpdateRequest);

    void delete(Long id);
}
