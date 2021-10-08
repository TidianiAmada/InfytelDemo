package com.saraya.app.service;


import com.saraya.app.entity.Customer;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CustomerService {
    public List<Customer> findCustomers();
    public Customer addCustomer(Customer customer);
}
