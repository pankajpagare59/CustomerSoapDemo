package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.Customer;

@Component
public class CustomerRepository {
	
	private static final Map<Integer, Customer> customers = new HashMap<>();
	
	@PostConstruct
	public void initData()
	{
		Customer cust1 = new Customer();
		
		cust1.setName("Pankaj");
		cust1.setAddres("Pune");
		cust1.setContact(9999999);
		cust1.setId(5959);
		
		customers.put(cust1.getId(), cust1);
		
		Customer cust2 = new Customer();
		
		cust2.setName("Harshali");
		cust2.setAddres("Nashik");
		cust2.setContact(89888889);
		cust2.setId(5858);
		
		customers.put(cust2.getId(), cust2);
		
		Customer cust3 = new Customer();
		
		cust3.setName("Pagare");
		cust3.setAddres("Pune Satare");
		cust3.setContact(98885248);
		cust3.setId(5449);
		
		customers.put(cust3.getId(), cust3);
	}
	

	public Customer findCustomer(int id) {
		
	System.out.println("Heoooooooo");
		return customers.get(id);
	}
	
	public  void findAllCustomer()
	{
		customers.values().iterator().forEachRemaining(System.out::println);
	}

}
