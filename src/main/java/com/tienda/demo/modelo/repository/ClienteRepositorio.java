package com.tienda.demo.modelo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.demo.modelo.entity.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
