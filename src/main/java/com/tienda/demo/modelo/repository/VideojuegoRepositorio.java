package com.tienda.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.modelo.entity.Videojuego;

public interface VideojuegoRepositorio extends JpaRepository<Videojuego,Long> {

}
