package com.tobeto.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.CandidateService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.dtos.candidate.CreateCandidateRequest;
import com.tobeto.dtos.candidate.GetAllCandidateResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/candidates")
@AllArgsConstructor
public class CandidatesControllers {
   
	
	
	private CandidateService candidateService;
	
	    
//	    public CandidatesControllers(CandidateService candidateService) {
//	        super();
//	    	this.candidateService = candidateService;
//	    }

	@GetMapping("/getAll")
	public DataResult<List<GetAllCandidateResponse>> getAll() {
		return this.candidateService.getAll();
	}

	//@Valid
	@PostMapping("/add")
	public Result add(@RequestBody CreateCandidateRequest candidateRequest) {
		return this.candidateService.add(candidateRequest);
	}
	
}
