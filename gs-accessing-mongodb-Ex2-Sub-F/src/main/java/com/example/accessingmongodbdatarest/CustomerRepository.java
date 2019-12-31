package com.example.accessingmongodbdatarest;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.accessingmongodbdatarest.Customer;


public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findBymsisdn(String msisdn);
}
