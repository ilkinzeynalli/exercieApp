package com.ilkinzeynalli.exerciseApp.service;

import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerSearchDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerCreateRequestDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerUpdateRequestDto;

import java.util.List;

public interface ICustomerService {

    List<CustomerSearchDto> search();

    CustomerDto create(CustomerCreateRequestDto customerCreateRequestDto);

    CustomerDto getById(Long id);

    CustomerDto update(CustomerUpdateRequestDto customerUpdateRequest);

    void delete(Long id);
}
