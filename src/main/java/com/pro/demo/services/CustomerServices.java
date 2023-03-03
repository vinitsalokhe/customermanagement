package com.pro.demo.services;



import java.util.List;

import com.pro.demo.entity.Customer;

public interface CustomerServices {

	Customer createCustomer(Customer ctr);

	Customer getCustomerById(int id);

	Customer updateCustomerById(int id, Customer ctr);

	void deleteById(int id);

	List<Customer> getAllCustomer();


	



}
