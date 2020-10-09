package com.st.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.model.Employee;
import com.st.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Integer saveEmpData(Employee emp) {
		Integer empNo=repo.save(emp).getEmpCode();
		return empNo;
	}

	@Override
	public List<Employee> getAllEmpData() {
		List<Employee> getAllEmp=repo.findAll();
		return getAllEmp;
	}

	@Override
	public List<String> findAddresdByDoj(String name) {
		List<String> addressByDoj = repo.getAddressByDoj(name);
		return addressByDoj;
	}

	
}
