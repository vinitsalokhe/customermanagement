package com.pro.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.demo.dao.CustomerDao;
import com.pro.demo.entity.Customer;

@Service
public class CustomerServicesImple implements CustomerServices {

	@Autowired
	CustomerDao dao;

	@Override
	public Customer createCustomer(Customer ctr) {
		return dao.save(ctr);
	}
	
	@Override
	public Customer getCustomerById(int id) {
//		return dao.getById(id);
		return dao.findById(id).get();
	}

	@Override
	public Customer updateCustomerById(int id, Customer ctr) {
		Customer c1 = dao.findById(id).get();
		c1.setName(ctr.getName());
		c1.setMobNo(ctr.getMobNo());
		c1.setCity(ctr.getCity());
		return dao.save(c1);
	}

	@Override
	public void deleteById(int id) {
		 dao.deleteById(id);
	}

	
	
	  @Override 
	  public List<Customer> getAllCustomer() { 
		  return dao.getAllCustomer(); 
		  }
	 
	
	

	
	
	
}
