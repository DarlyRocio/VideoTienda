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
import com.tienda.demo.modelo.entity.Productor;
import com.tienda.demo.modelo.service.IProductorService;

@Controller
@RequestMapping("/views/productor")
public class ProductorController {

	@Autowired
	IProductorService iproductorService;

	@GetMapping("/")
	public String Listarproductor(Model model) {

		List<Productor> listado = iproductorService.listarProductor();

		model.addAttribute("titulo", "Listado de Productores");
		model.addAttribute("listado", listado);

		return "/views/productor/pListar";
	}

	@GetMapping("/pcrear")
	public String crearNuevo(Model model) {

		Productor productor = new Productor();

		model.addAttribute("titulo", "Editar Productor");
		model.addAttribute("productor", productor);

		return "views/productor/frmcrearp";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Productor productor ) {
		 
		 iproductorService.guardarProductor(productor);
		 
		 return "redirect:/views/productor/";
	 }
	
	
	@GetMapping("/edit/{id}")
	public String eliminar(@PathVariable ("id") Long id_productor, Model model) {
		 
		Productor productor= iproductorService.buscarPorId(id_productor);
		
		model.addAttribute("titulo","Formulario: Editar Productor");
		model.addAttribute("productor",productor);
		
		return "/views/productor/frmcrearp";
		
		 
	 }
	
	@GetMapping("/eliminar/{id}")
	public String eliminarproductor(@PathVariable ("id")  Long id_productor,  Model model) {
		
		iproductorService.eliminarProductor(id_productor);
		
		System.out.println("Registro eliminado con exito");
		
		return "redirect:/views/productor/";
	}
	
	
	
}
