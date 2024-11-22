package com.tobeto.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.CandidateService;
import com.tobeto.business.abstracts.UserCheckService;
import com.tobeto.business.businessRules.BusinessRulesService;
import com.tobeto.core.config.modelMapper.ModelMapperService;
import com.tobeto.core.utilities.DataResult;
import com.tobeto.core.utilities.ErrorResult;
import com.tobeto.core.utilities.Result;
import com.tobeto.core.utilities.SuccessDataResult;
import com.tobeto.core.utilities.SuccessResult;
import com.tobeto.dataAccess.abstracts.CandidateDao;
import com.tobeto.dataAccess.abstracts.VerificationCodeCandidateDao;
import com.tobeto.dtos.candidate.CreateCandidateRequest;
import com.tobeto.dtos.candidate.GetAllCandidateResponse;
import com.tobeto.entities.concretes.Candidate;
import com.tobeto.entities.confirm.VerificationCodeCandidate;

@Service
public class CandidateManager implements CandidateService{
    
	@Autowired
	private CandidateDao candidateDao;
	
	@Autowired
	@Qualifier("mernisServiceAdapter")
	private UserCheckService userCheckService;
	
	
	@Autowired
	private BusinessRulesService businessRulesService;
	
	@Autowired
	private VerificationCodeCandidateDao verificationCodeCandidateDao;
	
	@Autowired
	private ModelMapperService modelMapper;

	@Override
	public Result add(CreateCandidateRequest request) {
		
		//Candidate candidate = modelMapper.forRequest().map(request, Candidate.class);
		
		Candidate candidate = new Candidate();
		candidate.setNationalityId(request.getNationalityId());
		candidate.setFirstName(request.getFirstName());
		candidate.setLastName(request.getLastName());
		candidate.setBirthYear(request.getBirthYear());
        candidate.setEmail(request.getEmail());
        candidate.setPassword(request.getPassword());
        candidate.setPasswordRepeat(request.getPasswordRepeat());
		
		if (!userCheckService.CheckIfRealPerson(candidate))
			return new ErrorResult("Not a valid person");

		if (candidateDao.existsByEmail(candidate.getEmail()))
			return new ErrorResult("Email already exists!");

		if (!businessRulesService.passwordsCheck(candidate.getPassword(), candidate.getPasswordRepeat()))
			return new ErrorResult("Passwords do not match!");

		if (candidateDao.existsByNationalityId(candidate.getNationalityId()))
			return new ErrorResult("Identification number already in use!");

		VerificationCodeCandidate verificationCodeCandidate = new VerificationCodeCandidate();
		verificationCodeCandidate.setCandidate(candidate);
		verificationCodeCandidate.setCode("12345");
		verificationCodeCandidate.setVerified(false);
		verificationCodeCandidate.setVerifiedDate(LocalDate.now());
		
		this.verificationCodeCandidateDao.save(verificationCodeCandidate);
		
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate is added");
		
		
	}

	@Override
	public DataResult<List<GetAllCandidateResponse>> getAll() {
		List<Candidate> candidates = this.candidateDao.findAll();
		
		List<GetAllCandidateResponse> responses = candidates.stream()
				.map(c -> modelMapper.forResponse().map(c, GetAllCandidateResponse.class)).toList();
		
		
		return new SuccessDataResult<List<GetAllCandidateResponse>>(responses, "Data Listelendi");
	}
}
