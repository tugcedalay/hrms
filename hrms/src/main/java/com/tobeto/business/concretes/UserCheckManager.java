package com.tobeto.business.concretes;

import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.UserCheckService;
import com.tobeto.entities.concretes.Candidate;

@Service
public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Candidate candidate) {
		
		return true;
	}

}
