package com.st.service;

import java.util.List;

import com.st.model.Employee;



public interface EmployeeService {

	public Integer saveEmpData(Employee emp);
	public List< Employee> getAllEmpData();
	public List<String> findAddresdByDoj(String name);
}
