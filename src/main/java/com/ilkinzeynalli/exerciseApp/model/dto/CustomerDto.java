package com.ilkinzeynalli.exerciseApp.model.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Long id;
    private String name;
    private boolean status;
    private CompanyDto company;
}
