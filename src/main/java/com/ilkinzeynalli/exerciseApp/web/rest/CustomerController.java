package com.ilkinzeynalli.exerciseApp.web.rest;

import com.ilkinzeynalli.exerciseApp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseApp.model.entity.Customer;
import com.ilkinzeynalli.exerciseApp.service.CustomerService;
import com.ilkinzeynalli.exerciseApp.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/customers")
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<CustomerDto>> getAll(){

        return ResponseEntity.ok(customerService.getAll());
    }
}
