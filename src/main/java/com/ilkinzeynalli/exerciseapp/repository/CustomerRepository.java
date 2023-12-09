package com.ilkinzeynalli.exerciseapp.repository;

import com.ilkinzeynalli.exerciseapp.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
