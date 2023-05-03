package com.tienda.demo.modelo.service;

import java.util.List;


import com.tienda.demo.modelo.entity.Director;

public interface IDirectorService {
	
	
	public List<Director> ListarDirector();
	
	public void guardar(Director director);
	
	public Director buscarPorId(Long id);
	
	public void eliminar(Long id);

}
