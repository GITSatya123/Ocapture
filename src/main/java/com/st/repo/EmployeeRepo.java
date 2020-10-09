package com.st.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.st.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable>{

	@Query("select address from Employee where firstName=:name")
	public List<String> getAddressByDoj(String name);

}
