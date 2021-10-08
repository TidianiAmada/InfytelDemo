package com.saraya.app.service;

import com.saraya.app.entity.Customer;

import com.saraya.app.entity.Plan;
import com.saraya.app.repository.CustomerRepo;
import com.saraya.app.repository.PlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    PlanRepo planRepo;

    @Override
    public List<Plan> findplans() {
        return planRepo.findAll();
    }

    @Override
    public Plan addCustomer(Plan plan) {
        return planRepo.save(plan);
    }
}
