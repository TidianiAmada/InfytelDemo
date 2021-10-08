package com.saraya.app.service;

import com.saraya.app.entity.Customer;
import com.saraya.app.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PlanService  {
    public List<Plan> findplans();
    public Plan addCustomer(Plan plan);
}
