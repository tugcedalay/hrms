package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
         
}
