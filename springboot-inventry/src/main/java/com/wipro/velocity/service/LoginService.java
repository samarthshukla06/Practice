package com.wipro.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.velocity.model.Dealer;
import com.wipro.velocity.repository.DealerRepository;

@Service
@Transactional
public class LoginService {

	@Autowired
	private DealerRepository drepo;

	public void saveDealer(Dealer dealer) {
		drepo.save(dealer); // invokes save() method of JPA repository
	}

	public Dealer findByEmail(String email) {
		return drepo.findByEmail(email);
	}

}
