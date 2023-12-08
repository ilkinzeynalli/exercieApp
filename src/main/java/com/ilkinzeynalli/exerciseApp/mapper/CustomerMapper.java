package com.ilkinzeynalli.exerciseApp.mapper;

import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto mapToCustomerDto(Customer customer);

    List<CustomerDto> mapToCustomerDtoList(List<Customer> customer);

}
