package com.tienda.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.modelo.entity.Marca;

public interface MarcaRepositorio extends JpaRepository<Marca, Long>{

}
