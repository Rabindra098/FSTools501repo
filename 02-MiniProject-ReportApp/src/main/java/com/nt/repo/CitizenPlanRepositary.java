package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.CitizenPlan;

public interface CitizenPlanRepositary extends JpaRepository<CitizenPlan, Integer> {

}
