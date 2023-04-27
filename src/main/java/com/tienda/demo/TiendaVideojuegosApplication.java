package com.tienda.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tienda.demo.modelo.Clientes;
import com.tienda.demo.modelo.ClientesRepositorio;

@SpringBootApplication
public class TiendaVideojuegosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TiendaVideojuegosApplication.class, args);
	}
	
	
		@Autowired
		private ClientesRepositorio repositorioCli;
	
		@Override
		public void run(String... args) throws Exception {
			
		try {
			
		//	Clientes clienteInsertar = new Clientes("Mariana","Lopez",35,"873409","calle 15","lolo@lolo");
		//	repositorioCli.save(clienteInsertar);
			
			
			
			
			List<Clientes> clientes = repositorioCli.findAll();
						
			clientes.forEach(System.out::println);
			
		}catch(Exception e){
	    	
			System.out.println("El error "+ e.getMessage());
	    	
	    }

		
		}
	
	
}
