package com.hcoelho.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcoelho.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
