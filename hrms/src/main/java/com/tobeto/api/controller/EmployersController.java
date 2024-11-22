package com.tobeto.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.EmployersService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.dtos.employer.GetAllEmployerResponse;

import lombok.AllArgsConstructor;

@RequestMapping("/api/v1/employers")
@RestController
@AllArgsConstructor
public class EmployersController {
      
	private EmployersService employersService;
	
	
	
	@GetMapping("/getall")
	public DataResult<List<GetAllEmployerResponse>> getAll(){
		return this.employersService.getAll();	
		}
	
	
}
