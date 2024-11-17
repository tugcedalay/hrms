package com.tobeto.business.abstracts;

import com.tobeto.entities.concretes.Candidate;

public interface UserCheckService {
  boolean CheckIfRealPerson(Candidate candidate);
}
