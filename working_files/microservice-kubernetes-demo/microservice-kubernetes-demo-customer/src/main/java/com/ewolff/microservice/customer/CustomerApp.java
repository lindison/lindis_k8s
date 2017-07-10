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

	@PostConstruct
	public void generateTestData() {
		customerRepository
				.save(new Customer("Eberhard", "Wolff", "eberhard.wolff@gmail.com", "Unter den Linden", "Berlin"));
		customerRepository.save(new Customer("Albert", "Einstein", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Marie", "Curie", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Nikola", "Tesla", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("CV", "Raman", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Meghnad", "Saha", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Niels", "Bohr", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Edward", "Bouchet", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Shirley", "Jackson", "rod@somewhere.com", "Market Street", "San Francisco"));		
		customerRepository.save(new Customer("Abdus", "Salam", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Werner", "Heisenberd", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Mileva", "Maric", "rod@somewhere.com", "Market Street", "San Francisco"));
		customerRepository.save(new Customer("Kristine", "Meyer", "rod@somewhere.com", "Market Street", "San Francisco"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApp.class, args);
	}

}
