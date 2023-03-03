package com.pro.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name="ctr_name")
	String name;
	@Column(name="ctr_mobNo")
	long mobNo;
	@Column(name="ctr_city")
	String city;
	
	public Customer() {
		super();
	}

	public Customer(int id, String name, long mobNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", city=" + city + "]";
	}
	
	

}
