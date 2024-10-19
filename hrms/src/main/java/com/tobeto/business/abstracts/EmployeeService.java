package com.tobeto.business.abstracts;

import com.tobeto.entities.concretes.Employee;

public interface EmployeeService extends GenericService<Employee>{
      boolean confirmEmployer(int employerId);
}
