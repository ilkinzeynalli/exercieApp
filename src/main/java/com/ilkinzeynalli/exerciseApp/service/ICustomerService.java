package com.ilkinzeynalli.exerciseApp.service;

import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerRequestDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerResponseDto;

import java.util.List;

public interface ICustomerService {

     CustomerResponseDto create(CustomerRequestDto customerRequestDto);

     List<CustomerDto> getAll();


}
