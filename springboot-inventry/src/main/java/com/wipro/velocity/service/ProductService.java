package com.wipro.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.velocity.model.Product;
import com.wipro.velocity.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository prepo;

	public void save(Product product) {
		prepo.save(product);
	}
}
