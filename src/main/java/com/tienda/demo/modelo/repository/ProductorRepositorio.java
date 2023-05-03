package com.tienda.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.modelo.entity.Productor;

public interface ProductorRepositorio extends JpaRepository<Productor, Long>{
	
	
}
