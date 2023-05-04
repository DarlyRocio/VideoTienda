package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Productor;



public interface IProductorService {
	
	
	public List<Productor> listarProductor();
	
	public void guardarProductor(Productor productor);
	
	public void eliminarProductor(Long id);
	
	public Productor buscarPorId(Long id);
	

}
