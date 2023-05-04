package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Protagonista;
import com.tienda.demo.modelo.repository.ProtagonistaRepositorio;




@Service
public class ProtagonistaServiceImplement implements IProtagonistaService{
	
	
	@Autowired
	private ProtagonistaRepositorio protagonistaRep;

	@Override
	public List<Protagonista> listarProtagonistas() {
		
		return (List<Protagonista>) protagonistaRep.findAll();
	}

	@Override
	public void guardarProtagonista(Protagonista protagonista) {
		protagonistaRep.save(protagonista);
		
	}

	@Override
	public void eliminar(Long id) {
	
		protagonistaRep.deleteById(id);
		
	}

	@Override
	public Protagonista buscarPorId(Long id) {
	
		return protagonistaRep.findById(id).orElse(null);
	}

	
	
	
	

}
