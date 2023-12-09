package com.ilkinzeynalli.exerciseapp.mapper;

import com.ilkinzeynalli.exerciseapp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerSearchDto;
import com.ilkinzeynalli.exerciseapp.model.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto mapToCustomerDto(Customer customer);

    CustomerSearchDto mapToCustomeSearchDto(Customer customer);
}
