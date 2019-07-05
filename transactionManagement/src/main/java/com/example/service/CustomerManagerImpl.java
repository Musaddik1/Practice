package com.example.service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;

public class CustomerManagerImpl implements CustomerManager {

	
	private CustomerDao customerDoa;
	
	
	
	public void setCustomerDoa(CustomerDao customerDoa) {
		this.customerDoa = customerDoa;
	}



	@Override
	public void createCustomer(Customer cust) {
		customerDoa.create(cust);
	}

}
