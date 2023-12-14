package com.example.mscustomer.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerSearchDto {

    private Long id;
    private String name;
    private boolean status;
    private CompanyDto company;
}
