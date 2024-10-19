package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
    boolean existsByEmail(String email);
    
    boolean existsByNationalityId(String nationalityId);
}
