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

import com.tienda.demo.modelo.entity.Protagonista;
import com.tienda.demo.modelo.service.IProtagonistaService;







@Controller
@RequestMapping("/views/protagonista")
public class ProtagonistaController {
	
	
	@Autowired
	private IProtagonistaService iprotagonistaService;
	
	
	@GetMapping("/")
	public String listadoProtagonista(Model model) {
		
		List<Protagonista> listado= iprotagonistaService.listarProtagonistas();
		model.addAttribute("titulo", "Lista de Protagonistas");
		model.addAttribute("listado", listado);
		
		return "/views/protagonista/plistar";
	
	}
	
	@GetMapping("/pcrear")
	public String crearProtagonista(Model model) {
		
		Protagonista protagonista=new Protagonista();
		model.addAttribute("titulo", "Nuevo Protagonista");
		model.addAttribute("protagonista", protagonista);
		
		return "/views/protagonista/frmpCrear";
		
	}
	
	@GetMapping("/edit/{id}")
	public String editarProtagonista(@PathVariable ("id") Long id_protagonista, Model model) {
		
		Protagonista protagonista = iprotagonistaService.buscarPorId(id_protagonista);
		model.addAttribute("titulo", "Editar protagonista");
		model.addAttribute("protagonista", protagonista);
		
		return "/views/protagonista/frmpCrear";
		
	}
	
	@PostMapping("/save")
	public String guardarProtagonista(@ModelAttribute Protagonista protagonista) {
		
		iprotagonistaService.guardarProtagonista(protagonista);
		
		return "redirect:/views/protagonista/";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable ("id") Long id_protagonista) {
		
		iprotagonistaService.eliminar(id_protagonista);
		
		return "redirect:/views/protagonista/";
	}
	

}
