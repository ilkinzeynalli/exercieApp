package com.example.msmain.mapper;

import com.example.msmain.model.dto.CustomerDto;
import com.example.msmain.model.dto.CustomerSearchDto;
import com.example.msmain.model.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto mapToCustomerDto(Customer customer);

    CustomerSearchDto mapToCustomeSearchDto(Customer customer);
}
