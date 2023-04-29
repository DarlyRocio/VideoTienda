package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Clientes;
import com.tienda.demo.modelo.repository.ClientesRepositorio;

@Service
public class ClienteServiceImplement implements IClienteService {
	
	
	@Autowired
	private ClientesRepositorio repositorioCli;

	@Override
	public List<Clientes> ListarClientes() {
		
		return (List<Clientes>) repositorioCli.findAll();
	}

	@Override
	public void guardar(Clientes cliente) {
		repositorioCli.save(cliente);
		
	}

	@Override
	public Clientes buscarPorId(Long id) {
		
		return repositorioCli.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		repositorioCli.deleteById(id);
		
	}

}
