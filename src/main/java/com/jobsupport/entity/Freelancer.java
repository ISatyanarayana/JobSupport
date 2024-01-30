package com.jobsupport.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Freelancer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String firstname;

	private String lastname;

	private long phonenumber;

	private String email;

	private String password;

	private String role;

	private String country;
	
	private LocalDate dob;
	
	private String gender;

	private long experience;

	private String description;

	private String domain;
}
