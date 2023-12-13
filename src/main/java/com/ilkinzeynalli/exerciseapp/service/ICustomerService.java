package com.ilkinzeynalli.exerciseapp.service;

import com.ilkinzeynalli.exerciseapp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerSearchDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerCreateRequestDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerUpdateRequestDto;
import com.ilkinzeynalli.exerciseapp.specification.SearchCustomerCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {

    List<CustomerSearchDto> search(SearchCustomerCriteria customerCriteria, Pageable pageable);

    CustomerDto create(CustomerCreateRequestDto customerCreateRequestDto);

    CustomerDto getById(Long id);

    CustomerDto update(CustomerUpdateRequestDto customerUpdateRequest);

    void delete(Long id);
}
