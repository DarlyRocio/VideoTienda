package com.tienda.demo.controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tienda.demo.modelo.Clientes;

@Controller
public class IndexController {
	
	@GetMapping("/")	
	public String index()
	{
		return "index";
	}
	
	
	

}
