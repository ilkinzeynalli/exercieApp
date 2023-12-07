package com.ilkinzeynalli.exerciseApp.service;

import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.entity.Customer;

import java.util.List;

public interface ICustomerService {

     List<CustomerDto> getAll();
}
