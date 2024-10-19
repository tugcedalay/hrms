package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.confirm.EmployeeConfirmEmployer;

public interface EmployeeConfirmEmployerDao extends JpaRepository<EmployeeConfirmEmployer, Integer> {
    
}
