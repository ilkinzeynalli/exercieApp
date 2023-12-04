package com.ilkinzeynalli.exerciseApp.controller;

import com.ilkinzeynalli.exerciseApp.model.Customer;
import com.ilkinzeynalli.exerciseApp.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/customers")
public class CustomerController {

    private final ICustomerService customerService;

    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerService.getAll());
    }
}
