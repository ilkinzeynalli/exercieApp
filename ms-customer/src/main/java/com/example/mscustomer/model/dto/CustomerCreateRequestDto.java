package com.example.mscustomer.model.dto;

import lombok.Data;

@Data
public class CustomerCreateRequestDto {

    private Long id;
    private String name;
    private boolean status;
    private CompanyRequestDto company;
}
