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
import com.tienda.demo.modelo.entity.Marca;
import com.tienda.demo.modelo.entity.Productor;
import com.tienda.demo.modelo.entity.Protagonista;
import com.tienda.demo.modelo.entity.Videojuego;
import com.tienda.demo.modelo.service.IDirectorService;
import com.tienda.demo.modelo.service.IMarcaService;
import com.tienda.demo.modelo.service.IProductorService;
import com.tienda.demo.modelo.service.IProtagonistaService;
import com.tienda.demo.modelo.service.IVideojuegoService;

@Controller
@RequestMapping("/views/videojuego/")
public class VideojuegoController {
	
	
	@Autowired
	private IVideojuegoService ivideojuegoService;
	
	@Autowired
	private IDirectorService idirectorService;
	
	
	@Autowired
	private IProductorService iproductorService;
	
	@Autowired
	private IProtagonistaService iprotagonistaService;
	
	@Autowired
	private IMarcaService imarcaService;
	
	
	@GetMapping("/")
	public String listarVideojuegos(Model model) {
		List<Videojuego> listado = ivideojuegoService.listarVideojuego();
		model.addAttribute("titulo", "Listado de Videojuegos");
		model.addAttribute("listado", listado);
		
		return "/views/videojuego/vlistar";
		
	}
	
	
	@GetMapping("/crear")
	public String crearVideojuego(Model model) {
		Videojuego videojuego = new Videojuego();
		List<Director> listdirector = idirectorService.ListarDirector();
		List<Productor> listproductor = iproductorService.listarProductor();
		List<Protagonista> listprotagonista = iprotagonistaService.listarProtagonistas();
		List<Marca> listmarca = imarcaService.listarMarca();
		
		
		model.addAttribute("titulo", "Nuevo Videojuego");
		model.addAttribute("videojuego", videojuego);
		model.addAttribute("directores", listdirector);
		model.addAttribute("productores", listproductor);
		model.addAttribute("protagonistas", listprotagonista);
		model.addAttribute("marcas",listmarca);
		
		return "/views/videojuego/frmvcrear";
	}
	
	
	@GetMapping("/edit")
	public String editarVideojuego(@PathVariable ("id") Long id_videojuego, Model model) {
		
		Videojuego listado = ivideojuegoService.buscarporId(id_videojuego);
		model.addAttribute("titulo", "Editar Videojuego");
		model.addAttribute("listado",listado);
		
		return "/views/videojuego/frmvcrear";
		
	}
	
	@PostMapping("/save")
	public String guardarVideojuego(@ModelAttribute Videojuego videojuego) {
		
		ivideojuegoService.guardarvideojuego(videojuego);
		
		return "Redirect:/views/videojuego/";
	}
	
	
	@GetMapping("/delete")
	public String eliminarVideojuego(@PathVariable ("id") Long id_videojuego) {
		
		ivideojuegoService.eliminarjuego(id_videojuego);
		
		return "Redirect:/views/videojuego/";
	}
	

}
