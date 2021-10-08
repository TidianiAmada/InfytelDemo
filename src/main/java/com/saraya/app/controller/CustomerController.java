package com.saraya.app.controller;

import com.saraya.app.entity.Customer;
import com.saraya.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/api/customer")
    public List<Customer> fetchCustomers(){
        return customerService.findCustomers();
    }

    @PostMapping("/api/customer")
    ResponseEntity<Void> addCustomer(@RequestBody Customer customer){
        Customer cstmr= customerService.addCustomer(customer);
        if(cstmr==null){
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{phoneNo}").buildAndExpand(cstmr.getPhoneNo()).toUri();

        return ResponseEntity.created(location).build();

    }

}
