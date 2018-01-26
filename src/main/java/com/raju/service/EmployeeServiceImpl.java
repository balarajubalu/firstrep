package com.raju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.dao.EmployeeDao;
import com.raju.model.Employee;
@Repository
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeDao employeedao;
	public void addEmployee(Employee e) {
		
		employeedao.addEmployee(e);
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
