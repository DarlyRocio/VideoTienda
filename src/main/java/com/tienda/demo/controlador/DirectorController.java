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


import com.tienda.demo.modelo.entity.Director;
import com.tienda.demo.modelo.service.IDirectorService;







@Controller
@RequestMapping("/views/director")
public class DirectorController {
	
@Autowired
private IDirectorService idirectorService;


@GetMapping("/")
public String ListadoDirector(Model model) {
	
	List<Director> listado= idirectorService.ListarDirector();
	
	model.addAttribute("titulo", "Listado de Directores");
	model.addAttribute("listado", listado);
	
	return "/views/director/dlistar";
	
}
	
@GetMapping("/dcrear")
public String crearDirector(Model model) {
	
	Director director= new Director();
	
	model.addAttribute("titulo","Formulario: Nuevo Director");
	model.addAttribute("director",director);
	
	return "/views/director/frmdcrear";
	
}
	
@PostMapping("/save")
public String guardar(@ModelAttribute Director director) {
	
	idirectorService.guardar(director);
	return "redirect:/views/director/";
}

@GetMapping("/edit/{id}")
public String editarDirector(@PathVariable ("id")  Long id_director, Model model) {
	
	Director director= idirectorService.buscarPorId(id_director);
	
	model.addAttribute("titulo","Formulario: Editar Director");
	model.addAttribute("director",director);
	
	return "/views/director/frmdcrear";
	
}


@GetMapping("/eliminar/{id}")
public String eliminardirector(@PathVariable ("id")  Long id_director,  Model model) {
	
	idirectorService.eliminar(id_director);
	
	System.out.println("Registro eliminado con exito");
	
	return "redirect:/views/director/";
}
	
	

}
