package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Director;
import com.tienda.demo.modelo.repository.DirectorRepositorio;









@Service
public class DirectorServiceImplement implements IDirectorService {

	@Autowired
	DirectorRepositorio directorRepositorio;
	
	
	@Override
	public List<Director> ListarDirector() {
		
		return directorRepositorio.findAll() ;
	}

	@Override
	public void guardar(Director director) {
		
		directorRepositorio.save(director);
		
	}

	@Override
	public Director buscarPorId(Long id) {
		
		return directorRepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		
		directorRepositorio.deleteById(id);
	}

}
