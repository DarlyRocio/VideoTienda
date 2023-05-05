package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Videojuego;

public interface IVideojuegoService {
	
	public List<Videojuego> listarVideojuego();
	
	public void guardarvideojuego(Videojuego videojuego);
	
	public void eliminarjuego(Long id);
	
	public Videojuego buscarporId(Long id);
	

}
