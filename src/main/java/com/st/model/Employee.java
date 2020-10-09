package com.st.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="emp_tab")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="emp_code")
	private Integer EmpCode;
	private String firstName;
	private String lastName;
	private Integer salary;
	private String doj;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_code")
	private Set<Address> address;
}
