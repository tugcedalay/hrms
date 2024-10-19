package com.tobeto.adapters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.tobeto.business.abstracts.UserService;
import com.tobeto.entities.concretes.Candidate;
import kps.webservice.KPSPublic;

@Primary
@Service
public class MernisService implements UserService {

	@Override
	public boolean CheckPerson(Candidate candidate) {
		KPSPublic client = new KPSPublic();
		return client.getKPSPublicSoap().tcKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
				candidate.getFirstName(), candidate.getLastName(), candidate.getBirthYear());
	}
       
}
