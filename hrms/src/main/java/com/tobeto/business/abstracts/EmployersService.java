package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.dtos.employer.CreateEmployerRequest;
import com.tobeto.dtos.employer.GetAllEmployerResponse;


public interface EmployersService {
    Result add(CreateEmployerRequest request);
	
    DataResult<List<GetAllEmployerResponse>> getAll();
}
