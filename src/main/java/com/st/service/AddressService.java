package com.st.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.model.Address;
import com.st.repo.AddressRepo;

@Service
public class AddressService {
	@Autowired
	private AddressRepo addressRepo;

	public void saveAddress(Set<Address> address) {
		addressRepo.saveAll(address);
	}
}
