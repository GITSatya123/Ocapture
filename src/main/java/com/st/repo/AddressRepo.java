package com.st.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.st.model.Address;

public interface AddressRepo extends JpaRepository<Address,Serializable>{

}
