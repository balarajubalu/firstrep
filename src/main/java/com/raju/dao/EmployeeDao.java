package com.raju.dao;

import com.raju.model.Employee;

public interface EmployeeDao {
	public abstract  void addEmployee(Employee e);
	public abstract  Employee getEmployee();
}
