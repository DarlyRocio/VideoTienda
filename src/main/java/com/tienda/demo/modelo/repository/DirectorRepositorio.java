package com.tienda.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.modelo.entity.Director;

public interface DirectorRepositorio extends JpaRepository<Director, Long> {

}
