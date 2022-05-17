package com.jobiak.mdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mdb.model.Customer;



@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
