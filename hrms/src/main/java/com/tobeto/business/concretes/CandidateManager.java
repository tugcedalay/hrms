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

public class CandidateManager implements CandidateService{
    
	@Autowired
	private CandidateDao candidateDao;
	
	
	@Autowired
	private BusinessRulesService businessRulesService;
	
	
	
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data list");
	}

	@Override
	public Result add(Candidate entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
