package com.ewolff.microservice.customer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAutoConfiguration
@Component
public class CustomerApp {

	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerApp(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@PostConstructmvn 
	public void generateTestData() {
		customerRepository
				.save(new Customer("Eberhard", "Wolff", "eberhard.wolff@gmail.com", "Unter den Linden", "Berlin"));
		customerRepository.save(new Customer("Rod", "Johnson", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Albert", "Einstein", "albert.einstein@physics.com", "112 Mercer Street", "Princeton, NJ"));
		customerRepository.save(new Customer("Nikola", "Tesla", "nikola@physics.com", "1234 6th Avenue", "Manhattan, NY"));
		customerRepository.save(new Customer("Max", "Planck", "Planck@physics.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Micho", "Kaku", "mkaku@aol.com", "City College", "New York, NY"));
		customerRepository.save(new Customer("Marie", "Curie", "marie@physics.com", "Market Street", "Passy, France"));
		customerRepository.save(new Customer("Carl", "Sagan", "quick@carlsagan.com", "900 Stewart Avenue", "Ithaca, NY"));
		customerRepository.save(new Customer("Maria", "Goeppert-Mayer", "maria@physics.com", "El Camino Memorial Park", "San Diego, CA"));
		customerRepository.save(new Customer("Chandrasekhara", "Venkata Raman", "Chandrasekhara@physics.com", "8th Main, 15th cross", "Bengaluru, India"));
		customerRepository.save(new Customer("Wernet", "Heisenberg", "rod@somewhere.com", "Munich Waldfriedhof", "Munich, Germany"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApp.class, args);
	}

}
