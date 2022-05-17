package com.jobiak.mdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jobiak.mdb.model.Customer;
import com.jobiak.mdb.repository.CustomerRepo;

import java.util.List;
import java.util.Optional;




@Component
public class MyCommandLine implements CommandLineRunner{ 
	@Autowired
	CustomerRepo repo;
	
	@Autowired
	Customer cust;

	
		

@Override
public void run(String... args) throws Exception {
	
	cust.setAcctno(1L);
	cust.setName("Erica");
	cust.setBalance(5432);
	repo.save(cust);
	

	/*	
		Customer c1=new Customer();
		c1.setAcctno(101L);
		c1.setName("Xiang");
		c1.setBalance(4000);
        repo.save(c1);
		
		Customer c2=new Customer();
		c2.setAcctno(102L);
		c2.setName("Sunio");
		c2.setBalance(5000);
		repo.save(c2);

		Customer c3=new Customer();
		c3.setAcctno(103L);
		c3.setName("Suzuki");
		c3.setBalance(6000);
		repo.save(c3);


		Customer c4=new Customer();
		c4.setAcctno(104L);
		c4.setName("Nobitha");
		c4.setBalance(7000);
		repo.save(c4);
		
		
		Optional<Customer> cust =repo.findById(102L);
		  if(cust.isPresent()) {
			  System.out.println(cust.get());
			  
		  }
		 List<Customer>list =repo.findAll();
		 for(Customer c:list) {
			 System.out.println(c);
			 */
		 }
	    }
@Configuration

class CustomerConfiguration{
	@Bean
	public Customer createCustomer() {
		return new Customer();
	}
	
}













