package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Protagonista;



public interface IProtagonistaService {
	
	
	public List<Protagonista> listarProtagonistas();
	
	public void guardarProtagonista(Protagonista protagonista);
	
	public void eliminar(Long id);
	
	public Protagonista buscarPorId(Long id);

}
