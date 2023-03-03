package com.pro.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pro.demo.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	
	  @Query(value="select * from customer where ctr_name like '%x'",nativeQuery = true) 
	  public List<Customer> getAllCustomer();
	 
}
