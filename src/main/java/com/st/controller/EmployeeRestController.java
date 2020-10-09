		package com.st.controller;

import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.st.model.Address;
import com.st.model.Employee;
import com.st.service.AddressService;
import com.st.service.EmployeeService;

import lombok.Getter;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	private AddressService service2;
	
	
	@PostMapping("/save")
	@Consumes("application/json")
	public ResponseEntity<Integer> saveEmp(@RequestBody Employee emp ) {
		ResponseEntity<Integer> resp= null;
		try {
			if(emp!=null) {
				Set<Address> address = emp.getAddress();
				System.out.println(address);
				service2.saveAddress(address);
				resp=new ResponseEntity<>(service.saveEmpData(emp),HttpStatus.OK);
			}else {
				resp=new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		}catch(Exception e) {
			resp= new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		 
		return resp;
		
	}
	
	@GetMapping("/all")
	@Produces("application/json")
	
	public List<Employee> getAllEmployee() {
		
		List<Employee> allEmpData = service.getAllEmpData();
		return allEmpData;
		
	}
	
	@GetMapping("/address/{name}")
	@Produces("application/json")
	public List<String> getAddressByDoj(@PathVariable("name") String name ) {
		
		List<String> findAddresdByDoj = service.findAddresdByDoj(name);
		return findAddresdByDoj;
	}
}
