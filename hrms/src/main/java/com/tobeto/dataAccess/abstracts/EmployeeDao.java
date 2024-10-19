package com.tobeto.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
