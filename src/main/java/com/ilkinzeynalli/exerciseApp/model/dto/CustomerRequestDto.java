package com.ilkinzeynalli.exerciseApp.model.dto;

import lombok.Data;

@Data
public class CustomerRequestDto {

    private Long id;
    private String name;
    private boolean status;
    private CompanyRequestDto company;
}
