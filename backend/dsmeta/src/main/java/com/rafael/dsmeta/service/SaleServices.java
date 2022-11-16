package com.rafael.dsmeta.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rafael.dsmeta.intites.Sale;
import com.rafael.dsmeta.repositories.SalesRepository;

@Service
public class SaleServices {

	@Autowired
	public SalesRepository repo;

	public List<Sale> findAll() {

		return repo.findAll();
	}

	public Page<Sale> findPage(String minDate, String maxDate, Pageable pageable) {

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

		// consulta basica
		// LocalDate min = LocalDate.parse(minDate);
		// LocalDate max = LocalDate.parse(maxDate);

		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		return repo.findSales(min, max, pageable);
	}

	
	
}
