package com.tienda.demo.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.demo.modelo.entity.Marca;
import com.tienda.demo.modelo.service.IMarcaService;

@Controller
@RequestMapping("/views/marca")
public class MarcaController  {
	
	
	@Autowired
	private IMarcaService imarcaService;
	
	@GetMapping("/")
	public String listarMarca(Model model) {
		
		List<Marca>listado = imarcaService.listarMarca();
		
		model.addAttribute("titulo", "Lista de Marcas");
		model.addAttribute("listado", listado);
		
		return "/views/marca/mlistar";
		
	}
	
	@GetMapping("/crear")
	public String crearMarca(Model model){
		
		Marca marca = new Marca();
		model.addAttribute("titulo","Registrar Nueva Marca");
		model.addAttribute("marca", marca);
		
		return "/views/marca/mcrear";
		}
	
	@GetMapping("/edit/{id}")
	public String editarMarca(@PathVariable ("id") Long id_marca, Model model) {
		
		Marca marca= imarcaService.buscarPorId(id_marca);
		model.addAttribute("titulo","Editar Marca");
		model.addAttribute("marca", marca);
		
		return "/views/marca/mcrear";
		
	}
	@PostMapping("/save")
	public String guardarMarca(@ModelAttribute Marca marca) {
	
		imarcaService.guardarMarca(marca);
		
		return "redirect:/views/marca/";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id_marca) {
		
		imarcaService.eliminar(id_marca);
		
		return "redirect:/views/marca/";
	}
			
	

}
