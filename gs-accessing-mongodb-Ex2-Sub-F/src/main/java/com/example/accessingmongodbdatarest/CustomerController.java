package com.example.accessingmongodbdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.accessingmongodbdatarest.Customer;


@RestController
@RequestMapping("/customer")

public class CustomerController {
	
	
	@Autowired
	private CustomerRepository repository;
	
	
    @RequestMapping(value = "/{msisdn}",method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getmsisdn(@PathVariable("msisdn") String msisdn){
    	Customer customer = new Customer ();
    	customer=repository.findBymsisdn(msisdn);
        return new ResponseEntity<>(customer, HttpStatus.OK) ;
    }
    
    
    @RequestMapping(method = RequestMethod.POST)
    public  @ResponseBody ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
       	/*---------change this---------if (repository.exists((Example.of(customer)))) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;
       	}
       	
       	else {	*/
       		repository.save(customer);
       		return new ResponseEntity<>(customer,HttpStatus.OK) ;
       	}
    
    
    @RequestMapping(value= "/{msisdn}", method = RequestMethod.DELETE)
    public @ResponseBody ResponseEntity<?> deletCustomer(@PathVariable("msisdn") String msisdn) {
    	repository.delete(repository.findBymsisdn(msisdn));
        return new ResponseEntity<>(msisdn+"   Deleted",HttpStatus.OK) ;

    }
    
    
    @RequestMapping(value= "/{msisdn}", method = RequestMethod.PUT)
    public @ResponseBody ResponseEntity<?> updateCustomerName(@PathVariable("msisdn") String msisdn ,@RequestBody Customer customer) {
    	String name = customer.getname(); double balance = customer.getbalance();
    	customer=repository.findBymsisdn(msisdn);
    	if (name !=null) customer.setname(name);
    	if (balance != 0.0)customer.setbalance(balance);
       	repository.save(customer);
        return new ResponseEntity<>(customer,HttpStatus.OK) ;

    }
}

//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//,@RequestBody String name


/*
if(repository.existsById(customer.getId())) {
return new ResponseEntity<>(HttpStatus.NO_CONTENT);    	
}	
else {*/