package com.crm.app.customerservice.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.crm.app.customerservice.entity.Customer;
import com.crm.app.customerservice.repo.CustomerRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {

	private final CustomerRepository customerRepository;


	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return customerRepository.findAll();
	}

	@PostMapping("/customers")
	public ResponseEntity<Customer> createContact(@RequestBody Customer customer) throws URISyntaxException {
		Customer result = customerRepository.save(customer);
		return ResponseEntity.ok().body(result);
	}
}
