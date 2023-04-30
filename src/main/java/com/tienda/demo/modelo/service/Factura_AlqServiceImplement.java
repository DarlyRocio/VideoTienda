package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tienda.demo.modelo.entity.Factura_Alquiler;
import com.tienda.demo.modelo.repository.Factura_AlquilerRepositorio;

public class Factura_AlqServiceImplement implements IFactura_AlqService {
	
	
	
	
	@Autowired
	private Factura_AlquilerRepositorio FacRepositorio;
	
	

	@Override
	public List<Factura_Alquiler> listarFactura() {
		
		return FacRepositorio.findAll();
	}

	@Override
	public void guardarFactura(Factura_Alquiler facAlquiler) {
		
		
		FacRepositorio.save(facAlquiler);
	}

	@Override
	public void eliminarFacturabyId(Long id) {
		
		FacRepositorio.deleteById(id);		
		
	}

	@Override
	public Factura_Alquiler buscarFacturabyId(Long id) {
		
		return FacRepositorio.findById(id).orElse(null);
	}

}
