package com.tobeto.adapters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.UserCheckService;
import com.tobeto.entities.concretes.Candidate;

import kps.webservice.KPSPublic;

@Service
@Primary
public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(Candidate candidate) {
		KPSPublic client = new KPSPublic();
		return client.getKPSPublicSoap().tcKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
				candidate.getFirstName(), candidate.getLastName(), candidate.getBirthYear());
	}
}
