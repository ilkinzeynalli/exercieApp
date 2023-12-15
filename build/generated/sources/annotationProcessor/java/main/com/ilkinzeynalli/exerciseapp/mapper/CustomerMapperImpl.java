package com.ilkinzeynalli.exerciseapp.mapper;

import com.ilkinzeynalli.exerciseapp.model.dto.CompanyDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerDto.CustomerDtoBuilder;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerSearchDto;
import com.ilkinzeynalli.exerciseapp.model.dto.CustomerSearchDto.CustomerSearchDtoBuilder;
import com.ilkinzeynalli.exerciseapp.model.entity.Company;
import com.ilkinzeynalli.exerciseapp.model.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-14T18:40:44+0400",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto mapToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( customer.getId() );
        customerDto.name( customer.getName() );
        customerDto.status( customer.isStatus() );
        customerDto.company( companyToCompanyDto( customer.getCompany() ) );

        return customerDto.build();
    }

    @Override
    public CustomerSearchDto mapToCustomeSearchDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerSearchDtoBuilder customerSearchDto = CustomerSearchDto.builder();

        customerSearchDto.id( customer.getId() );
        customerSearchDto.name( customer.getName() );
        customerSearchDto.status( customer.isStatus() );
        customerSearchDto.company( companyToCompanyDto( customer.getCompany() ) );

        return customerSearchDto.build();
    }

    protected CompanyDto companyToCompanyDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto companyDto = new CompanyDto();

        companyDto.setId( company.getId() );
        companyDto.setName( company.getName() );
        companyDto.setStatus( company.isStatus() );

        return companyDto;
    }
}
