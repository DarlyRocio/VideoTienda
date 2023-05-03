package com.tienda.demo.modelo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="director")
public class Director {
	
	@Id
	@Column(name="id_director")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_director;
	private String nombre;
	private String apellido;
	private int id_videojuego;
	
	
	public Director() {
		super();
	}


		
	public Director(String nombre, String apellido, int id_videojuego) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_videojuego = id_videojuego;
	}



	public Director(Long id_director, String nombre, String apellido, int id_videojuego) {
		super();
		this.id_director = id_director;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_videojuego = id_videojuego;
	}



	public Long getId_director() {
		return id_director;
	}



	public void setId_director(Long id_director) {
		this.id_director = id_director;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getId_videojuego() {
		return id_videojuego;
	}



	public void setId_videojuego(int id_videojuego) {
		this.id_videojuego = id_videojuego;
	}



	@Override
	public String toString() {
		return "Director [id_director=" + id_director + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", id_videojuego=" + id_videojuego + "]";
	}
	
	
	
}
