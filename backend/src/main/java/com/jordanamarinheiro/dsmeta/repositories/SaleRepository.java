package com.jordanamarinheiro.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordanamarinheiro.dsmeta.entities.Sale;

public interface SaleRepository  extends JpaRepository<Sale, Long> {

}
