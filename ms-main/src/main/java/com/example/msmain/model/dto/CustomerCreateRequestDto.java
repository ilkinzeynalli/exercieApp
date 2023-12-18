package com.example.msmain.model.dto;

import lombok.Data;

@Data
public class CustomerCreateRequestDto {

    private Long id;
    private String name;
    private boolean status;
    private CompanyRequestDto company;
}
