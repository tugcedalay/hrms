package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.concretes.Employee;
import com.tobeto.entities.confirm.EmployeeConfirm;

public interface EmployeeConfirmDao extends JpaRepository<EmployeeConfirm, Integer>{

}
