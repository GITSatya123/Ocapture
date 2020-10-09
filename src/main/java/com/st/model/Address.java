package com.st.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="addres_tab")
@Data
public class Address {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="door_no")
	private Integer doorNo;
	private String landmark;
	private long mobileNo;
	private String city;
	
}
