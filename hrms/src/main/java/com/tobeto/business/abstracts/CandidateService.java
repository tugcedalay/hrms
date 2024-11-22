package com.tobeto.business.abstracts;


import java.util.List;

import org.springframework.stereotype.Service;

import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.dtos.candidate.CreateCandidateRequest;
import com.tobeto.dtos.candidate.GetAllCandidateResponse;

@Service
public interface CandidateService{
	Result add(CreateCandidateRequest request);
	
    DataResult<List<GetAllCandidateResponse>> getAll();
}
