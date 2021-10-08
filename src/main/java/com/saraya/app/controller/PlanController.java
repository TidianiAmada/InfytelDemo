package com.saraya.app.controller;

import com.saraya.app.entity.Customer;
import com.saraya.app.entity.Plan;
import com.saraya.app.service.CustomerService;
import com.saraya.app.service.PlanService;
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
public class PlanController {
    @Autowired
    PlanService planService;

    @GetMapping("/api/plan")
    public List<Plan> fetchPlans(){
        return planService.findplans();
    }

    @PostMapping("/api/plan")
    ResponseEntity<Void> addPlan(@RequestBody Plan plan){
        Plan cstmr= planService.addCustomer(plan);
        if(cstmr==null){
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{planId}").buildAndExpand(cstmr.getPlanId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
