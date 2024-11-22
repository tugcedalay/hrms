package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.EmployersService;
import com.tobeto.core.config.modelMapper.ModelMapperService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.core.utilities.SuccessDataResult;
import com.tobeto.dataAccess.abstracts.EmployerDao;
import com.tobeto.dtos.employer.CreateEmployerRequest;
import com.tobeto.dtos.employer.GetAllEmployerResponse;
import com.tobeto.entities.concretes.Employer;

@Service
public class EmployersManager  implements EmployersService{
   
	
	    @Autowired
		private EmployerDao employerDao;
	
	    @Autowired
	    private ModelMapperService modelMapperService;
	
	
	
	@Override
	public Result add(CreateEmployerRequest request) {
		return null;
	}

	@Override
	public DataResult<List<GetAllEmployerResponse>> getAll() {
      List<Employer> employers  =   this.employerDao.findAll();
		
      List<GetAllEmployerResponse> responses = employers.stream().map(e -> modelMapperService.forResponse()
    		  .map(e, GetAllEmployerResponse.class)).toList();
      
      
		return new SuccessDataResult<List<GetAllEmployerResponse>>(responses);
	}

}
