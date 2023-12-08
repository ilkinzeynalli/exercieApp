package com.ilkinzeynalli.exerciseApp.model.dto;

import lombok.Data;

@Data
public class CompanyRequestDto {

    private Long id;
    private String name;
    private boolean status;
}
