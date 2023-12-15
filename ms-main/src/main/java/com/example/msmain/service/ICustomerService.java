package com.example.msmain.service;

import com.example.msmain.model.dto.CustomerCreateRequestDto;
import com.example.msmain.model.dto.CustomerDto;
import com.example.msmain.model.dto.CustomerSearchDto;
import com.example.msmain.model.dto.CustomerUpdateRequestDto;
import com.example.msmain.specification.SearchCustomerCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {

    List<CustomerSearchDto> search(SearchCustomerCriteria customerCriteria, Pageable pageable);

    CustomerDto create(CustomerCreateRequestDto customerCreateRequestDto);

    CustomerDto getById(Long id);

    CustomerDto update(CustomerUpdateRequestDto customerUpdateRequest);

    void delete(Long id);
}
