package com.tienda.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.demo.modelo.entity.Cliente;
import com.tienda.demo.modelo.repository.ClienteRepositorio;



@Service
public class ClienteServiceImplement implements IClienteService {
	
	
	@Autowired
	private ClienteRepositorio repositorioCli;
	

	@Override
	public List<Cliente> ListarClientes() {
		
		return (List<Cliente>) repositorioCli.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		
		return repositorioCli.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		repositorioCli.deleteById(id);
		
	}

	@Override
	public void guardar(Cliente cliente) {
		repositorioCli.save(cliente);
		
	}

}
