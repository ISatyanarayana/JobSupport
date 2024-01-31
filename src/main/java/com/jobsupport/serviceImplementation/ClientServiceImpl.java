package com.jobsupport.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobsupport.dto.UserRequest;
import com.jobsupport.entity.Client;
import com.jobsupport.repository.ClientRepository;
import com.jobsupport.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void addClient(UserRequest request) {
		Client client=Client.builder()
				.firstname(request.getFirstname())
				.lastname(request.getLastname())
				.phonenumber(request.getPhonenumber())
				.email(request.getEmail())
				.password(request.getPassword())
				.country(request.getCountry())
				.dob(request.getDob())
				.role(request.getRole())
				.gender(request.getGender())
				.build();
		 clientRepository.save(client);
	}

}
