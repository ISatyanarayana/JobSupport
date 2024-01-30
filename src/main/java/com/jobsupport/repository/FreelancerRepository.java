package com.jobsupport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsupport.entity.Freelancer;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, String>{
	
}
