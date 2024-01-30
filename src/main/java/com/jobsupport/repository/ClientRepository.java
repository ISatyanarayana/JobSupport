package com.jobsupport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsupport.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, String>{

}
