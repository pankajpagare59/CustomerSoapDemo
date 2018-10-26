package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.Customer;
import io.spring.guides.gs_producing_web_service.GetCustomerByIDRequest;
import io.spring.guides.gs_producing_web_service.GetCustomerByIDResponse;
import io.spring.guides.gs_producing_web_service.GetCustomerByIDRequest;
import io.spring.guides.gs_producing_web_service.GetCustomerByIDResponse;

public class CustomerEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerEndpoint(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;
	}
	
	
	/*@PayloadRoot (namespace = NAMESPACE_URI, localPart = "getCustomerByIDRequest")
	@ResponsePayload
	public GetCustomerByIDResponse getAllCustomer()
	{
		GetCustomerByIDResponse response = new GetCustomerByIDResponse();
		System.out.println("hh");
		response.getCustomer(customerRepository.findAllCustomer());
		return response;
		
		
	}*/
	
	@PayloadRoot (namespace = NAMESPACE_URI, localPart = "getCustomerByIDRequest")
	@ResponsePayload
	public GetCustomerByIDResponse getCustomer(@RequestPayload GetCustomerByIDRequest request)
	{
		GetCustomerByIDResponse response = new GetCustomerByIDResponse();
		
		/*Customer cust1 = new Customer();*/
		
		System.out.println("hh");
		response.setCustomer(customerRepository.findCustomer(request.getId()));
		System.out.println(request.getId());
		return response;
		
		
	}
	
	
	

	

}
