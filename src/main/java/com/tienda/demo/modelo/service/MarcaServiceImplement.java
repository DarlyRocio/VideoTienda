package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Marca;
import com.tienda.demo.modelo.repository.MarcaRepositorio;





@Service
public class MarcaServiceImplement implements IMarcaService{

	
	@Autowired
	MarcaRepositorio marcaRepositorio;
	
	@Override
	public List<Marca> listarMarca() {
		
		return (List<Marca>) marcaRepositorio.findAll();
	}

	
	@Override
	public void eliminar(Long id) {
		
		marcaRepositorio.deleteById(id);
		
	}


	@Override
	public Marca buscarPorId(Long id) {
		
		return marcaRepositorio.findById(id).orElse(null);
	}


	

	@Override
	public void guardarMarca(Marca marca) {
		
		marcaRepositorio.save(marca);
	}

}
