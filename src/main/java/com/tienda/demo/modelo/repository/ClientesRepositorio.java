package com.tienda.demo.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.modelo.entity.Clientes;

public interface  ClientesRepositorio extends JpaRepository<Clientes,Long>  {

}
