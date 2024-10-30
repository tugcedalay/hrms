package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tobeto.business.abstracts.CandidateService;
import com.tobeto.business.businessRules.BusinessRulesService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.core.utilities.SuccessDataResult;
import com.tobeto.dataAccess.abstracts.CandidateDao;
import com.tobeto.entities.concretes.Candidate;
import com.tobeto.entities.concretes.JobTitles;

public class CandidateManager implements CandidateService{
    
	@Autowired
	private CandidateDao candidateDao;
	
	
	@Autowired
	private BusinessRulesService businessRulesService;
	
	
	
	

	@Override
	public Result add(Candidate entity) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
