package com.ilkinzeynalli.exerciseApp.mapper;

import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.dto.CustomerSearchDto;
import com.ilkinzeynalli.exerciseApp.model.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto mapToCustomerDto(Customer customer);

    CustomerSearchDto mapToCustomeSearchDto(Customer customer);
}
