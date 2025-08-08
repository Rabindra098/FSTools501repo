package com.nt.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CitizenPlan;
import com.nt.repo.CitizenPlanRepositary;

@Component
public class DataLoder implements CommandLineRunner {
	@Autowired
	private CitizenPlanRepositary repo;

	@Override
	public void run(String... args) throws Exception {
		// cash plan date
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Rabi");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmt(5000.0);

		// cash plan data for denied reason
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Omm");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDeclineReason("Rental Income");

	}
}
