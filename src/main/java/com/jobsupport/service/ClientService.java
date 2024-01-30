package com.jobsupport.service;

import com.jobsupport.dto.UserRequest;
import com.jobsupport.entity.Client;

public interface ClientService {
	
	public Client addClient(UserRequest request);
}
