package com.ewolff.microservice.catalog;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAutoConfiguration
@Component
public class CatalogApp {

	private final ItemRepository itemRepository;

	@Autowired
	public CatalogApp(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@PostConstruct
	public void generateTestData() {
		itemRepository.save(new Item("iPod", 42.0));
		itemRepository.save(new Item("iPod touch", 21.0));
		itemRepository.save(new Item("iPod nano", 1.0));
		itemRepository.save(new Item("Apple TV", 100.0));
		itemRepository.save(new Item("Measuring Tape", 2.0));
		itemRepository.save(new Item("Meter Stick", 2.0));
		itemRepository.save(new Item("Micrometer", 21.0));
		itemRepository.save(new Item("Micrometer Deluxe", 42.0));
		itemRepository.save(new Item("Trundle Wheel", 14.0));
		itemRepository.save(new Item("Digital Caliper", 32.0));
		itemRepository.save(new Item("AP Measuring Kit", 210.0));
		itemRepository.save(new Item("Copper Wire", 1.0));
		itemRepository.save(new Item("Hammer", 12.0));
		itemRepository.save(new Item("Apple", 0.75));
		itemRepository.save(new Item("Keithley Resistance Meter", 8720.0));
		itemRepository.save(new Item("Digital Electrometer", 20.0));
		itemRepository.save(new Item("Stop Watch", 8.50));
		itemRepository.save(new Item("Electostatic Tape", 13.0));
		itemRepository.save(new Item("Hubble Space Telescope", 1500.0));
	}

	public static void main(String[] args) {
		SpringApplication.run(CatalogApp.class, args);
	}

}
