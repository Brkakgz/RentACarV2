package com.rentacar.rentacar.repository;

import com.rentacar.rentacar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<Customer> findByEmail(String email);
}
