package com.tienda.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.demo.modelo.entity.Cliente;
import com.tienda.demo.modelo.service.IClienteService;



@Controller
@RequestMapping("/views/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/")
	public String listarClientes(Model model) {
		
		List<Cliente>listadoClientes= clienteService.ListarClientes();
				
		model.addAttribute("titulo", "listado de Clientes");
		model.addAttribute("cliente", listadoClientes);
		
		return "/views/clientes/listar";
	}
	

}
