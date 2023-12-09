package com.ilkinzeynalli.exerciseapp.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CustomerUpdateRequestDto {

    @NotNull
    private Long id;
    private CustomerUpdateDto customer;

    @Data
    class CustomerUpdateDto {

        private String name;
        private boolean status;
    }
}
