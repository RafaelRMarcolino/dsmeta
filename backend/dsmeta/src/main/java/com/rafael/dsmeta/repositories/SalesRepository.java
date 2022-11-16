package com.rafael.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.dsmeta.intites.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
