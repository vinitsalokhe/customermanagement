package com.pro.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.demo.dao.CustomerDao;
import com.pro.demo.entity.Customer;
import com.pro.demo.services.CustomerServices;

@RestController
@RequestMapping("/ctr-base")
public class CustomerController {
	@Autowired
	CustomerServices services;

	@PostMapping("/insert")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer ctr) {
		Customer c = services.createCustomer(ctr);
		return new ResponseEntity<Customer>(c, HttpStatus.CREATED);
	}

	@GetMapping("/toGet/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
		Customer c = services.getCustomerById(id);
		return new ResponseEntity<Customer>(c, HttpStatus.FOUND);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<?> updateCustomerById(@PathVariable("id") int id, @RequestBody Customer ctr) {
		Customer c = services.updateCustomerById(id, ctr);
		return new ResponseEntity<Customer>(c, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/reject/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
		services.deleteById(id);
		return ResponseEntity.ok("Customer delete succesfully.");
	}
	
	
	
	  @GetMapping("/all-customer")
	  public List<Customer> getAllCustomer(){
	  return services.getAllCustomer();
	  }
	 

}
