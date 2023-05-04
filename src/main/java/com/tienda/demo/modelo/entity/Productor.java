package com.tienda.demo.modelo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productor")
public class Productor implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_productor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_productor;
	private String nombre;
	private String apellido;
	private int id_videojuego;
	
	
	public Productor() {
		super();
	}


	public Productor(String nombre, String apellido, int id_videojuego) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_videojuego = id_videojuego;
	}


	public Productor(Long id_productor, String nombre, String apellido, int id_videojuego) {
		super();
		this.id_productor = id_productor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_videojuego = id_videojuego;
	}


	public Long getId_productor() {
		return id_productor;
	}


	public void setId_productor(Long id_productor) {
		this.id_productor = id_productor;
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
		return "Productor [id_productor=" + id_productor + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", id_videojuego=" + id_videojuego + "]";
	}
	
}
	
	
	