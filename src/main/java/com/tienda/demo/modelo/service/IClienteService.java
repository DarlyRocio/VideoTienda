package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Clientes;

public interface IClienteService {
	
	public List<Clientes>ListarClientes();
	
	public void guardar(Clientes cliente);
	
	public Clientes buscarPorId(Long id);
	
	public void eliminar(Long id);
	
	

}
