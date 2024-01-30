package com.jobsupport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {

	private String domain;
	
	private String contracttype;
	
	private String pname;
	
	private String pdescription;
	
	
}
