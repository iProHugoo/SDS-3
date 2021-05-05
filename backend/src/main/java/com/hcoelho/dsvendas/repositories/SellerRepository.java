package com.hcoelho.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcoelho.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
