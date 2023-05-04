package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Marca;

public interface IMarcaService {
	
	public List<Marca> listarMarca();
	
	public void guardarMarca(Marca marca);
	
	public void eliminar(Long id);
	
	public Marca buscarPorId(Long id);
	

}
