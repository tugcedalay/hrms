package com.tobeto.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.CandidateService;
import com.tobeto.business.abstracts.UserCheckService;
import com.tobeto.business.businessRules.BusinessRulesService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.ErrorResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.core.utilities.SuccessDataResult;
import com.tobeto.core.utilities.SuccessResult;
import com.tobeto.dataAccess.abstracts.CandidateDao;
import com.tobeto.entities.concretes.Candidate;
import com.tobeto.entities.concretes.JobTitles;

@Service
public class CandidateManager implements CandidateService{
    
	@Autowired
	private CandidateDao candidateDao;
	
	@Autowired
	@Qualifier("mernisServiceAdapter")
	private UserCheckService userCheckService;
	
	
	@Autowired
	private BusinessRulesService businessRulesService;
	
	
	

	@Override
	public Result add(Candidate candidate) {
		if (!userCheckService.CheckIfRealPerson(candidate))
			return new ErrorResult("Not a valid person");

		if (candidateDao.existsByEmail(candidate.getEmail()))
			return new ErrorResult("Email already exists!");

		if (!businessRulesService.passwordsCheck(candidate.getPassword(), candidate.getPasswordRepeat()))
			return new ErrorResult("Passwords do not match!");

		if (candidateDao.existsByNationalityId(candidate.getNationalityId()))
			return new ErrorResult("Identification number already in use!");

		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate is added");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
