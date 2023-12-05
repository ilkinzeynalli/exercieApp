package com.ilkinzeynalli.exerciseApp.repository;

import com.ilkinzeynalli.exerciseApp.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
