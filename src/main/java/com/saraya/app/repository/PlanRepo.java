package com.saraya.app.repository;

import com.saraya.app.entity.Customer;
import com.saraya.app.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanRepo extends JpaRepository<Plan,Integer> {

}
