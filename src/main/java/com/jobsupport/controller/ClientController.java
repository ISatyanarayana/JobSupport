package com.jobsupport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jobsupport.dto.UserRequest;
import com.jobsupport.service.ClientService;

@RestController
@RequestMapping("/api/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addClient(@RequestBody UserRequest request) throws Exception {
		if(request==null) {
			throw new Exception("Object cant be null..!!!");
		}
		else {
			clientService.addClient(request);
		}
	}
}
