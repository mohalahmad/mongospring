
package com.example.accessingmongodbdatarest;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findBymsisdn(String msisdn);
	
}
