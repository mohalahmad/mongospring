
package com.example.accessingmongodbdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


//@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan(basePackageClasses = CustomerController.class)

public class CustomerApp {

	
//	private static final Logger LOGGER = Logger.getLogger(CustomerApp.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerApp.class, args);
	}
	
	@Bean
	public CommandLineRunner init(CustomerRepository customerRepository) {
		return (args) -> {
			customerRepository.deleteAll();
			customerRepository.save(new Customer("0799999999", "Jafar", 55.55));

			
		};
	}

}
