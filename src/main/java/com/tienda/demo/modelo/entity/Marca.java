package com.tienda.demo.modelo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Marca implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id_marca;
	private String descripcion;
	
	public Marca() {
	super();
	}

	public Marca(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Marca(Long id_marca, String descripcion) {
		super();
		this.id_marca = id_marca;
		this.descripcion = descripcion;
	}

	public Long getId_marca() {
		return id_marca;
	}

	public void setId_marca(Long id_marca) {
		this.id_marca = id_marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Marca [id_marca=" + id_marca + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
		
	
}
