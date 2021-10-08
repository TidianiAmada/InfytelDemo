package com.saraya.app.service;

import com.saraya.app.entity.Customer;
import com.saraya.app.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public List<Customer> findCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
