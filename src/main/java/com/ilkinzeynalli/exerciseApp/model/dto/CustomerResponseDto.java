package com.ilkinzeynalli.exerciseApp.model.dto;

import lombok.Data;

@Data
public class CustomerResponseDto {

    private Long id;
    private String name;
    private boolean status;
    private CustomerCreatorDto customer;
}
