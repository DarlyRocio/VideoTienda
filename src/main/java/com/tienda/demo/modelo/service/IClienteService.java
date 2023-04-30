package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Cliente;



public interface IClienteService {
	
	public List<Cliente>ListarClientes();
	
	public void guardar(Cliente cliente);
	
	public Cliente buscarPorId(Long id);
	
	public void eliminar(Long id);
	
	

}
