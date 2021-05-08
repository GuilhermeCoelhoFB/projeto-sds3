package com.dev.devvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.devvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
