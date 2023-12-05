package com.ilkinzeynalli.exerciseApp.model.dto;

import com.ilkinzeynalli.exerciseApp.model.entity.Company;
import lombok.Data;

@Data
public class CustomerDto {

    private Long id;
    private String name;
    private boolean status;
    private Company company;
}
