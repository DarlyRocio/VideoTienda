package com.tienda.demo.modelo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="protagonista")
public class Protagonista implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_protagonista")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id_protagonista;
	private String nombre;
	private String apellido;
	private int id_videojuego;
	
	
	public Protagonista() {
		super();
	}


	public Protagonista(String nombre, String apellido, int id_videojuego) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_videojuego = id_videojuego;
	}


	public Protagonista(Long id_protagonista, String nombre, String apellido, int id_videojuego) {
		super();
		this.id_protagonista = id_protagonista;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_videojuego = id_videojuego;
	}


	public Long getId_protagonista() {
		return id_protagonista;
	}


	public void setId_protagonista(Long id_protagonista) {
		this.id_protagonista = id_protagonista;
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
		return "Protagonista [id_protagonista=" + id_protagonista + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", id_videojuego=" + id_videojuego + "]";
	}


	
	

}
