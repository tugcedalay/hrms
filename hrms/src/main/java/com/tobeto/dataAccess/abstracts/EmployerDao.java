package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.concretes.Employers;

public interface EmployerDao extends JpaRepository<Employers, Integer> {
         
}
