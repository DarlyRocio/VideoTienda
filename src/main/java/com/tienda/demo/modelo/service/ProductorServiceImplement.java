package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Productor;
import com.tienda.demo.modelo.repository.ProductorRepositorio;




@Service
public class ProductorServiceImplement implements IProductorService{

	
	
	@Autowired
	ProductorRepositorio productorRepositorio;
	
	
	
	
	@Override
	public List<Productor> listarProductor() {
		
		return productorRepositorio.findAll();
	}

	

	@Override
	public void eliminarProductor(Long id) {
		
		productorRepositorio.deleteById(id);
	}

	@Override
	public Productor buscarPorId(Long id) {
		
		return productorRepositorio.findById(id).orElse(null);
	}

	@Override
	public void guardarProductor(Productor productor) {
		productorRepositorio.save(productor);
		
	}

}
