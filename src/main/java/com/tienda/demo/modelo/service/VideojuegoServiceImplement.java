package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Videojuego;
import com.tienda.demo.modelo.repository.VideojuegoRepositorio;



@Service
public class VideojuegoServiceImplement  implements IVideojuegoService{

	
	@Autowired
	private VideojuegoRepositorio videojuegoRep;

	
	
	@Override
	public List<Videojuego> listarVideojuego() {
		
		return (List<Videojuego>) videojuegoRep.findAll();
	}

	

	@Override
	public void eliminarjuego(Long id) {
		
		videojuegoRep.deleteById(id);
		
	}

	@Override
	public Videojuego buscarporId(Long id) {
		
		return videojuegoRep.findById(id).orElse(null);
	}

	@Override
	public void guardarvideojuego(Videojuego videojuego) {
		
		videojuegoRep.save(videojuego);
		
	}
	
	
	
	
	
}
