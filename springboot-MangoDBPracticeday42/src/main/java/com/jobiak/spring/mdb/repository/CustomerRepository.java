package com.jobiak.spring.mdb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.spring.mdb.model.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long>{

}
