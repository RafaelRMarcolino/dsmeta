package com.rafael.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.dsmeta.intites.Sale;
import com.rafael.dsmeta.repositories.SalesRepository;

@Service
public class SaleServices {

	@Autowired
	public SalesRepository repo;
	
	public List<Sale> findAll(){
		
		return repo.findAll();
	}

}
