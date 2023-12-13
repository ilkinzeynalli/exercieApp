package com.ilkinzeynalli.exerciseapp.specification;

import com.ilkinzeynalli.exerciseapp.model.entity.Company;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SearchCustomerCriteria {

    private String name;
    private String companyName;
}
