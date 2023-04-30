package com.tienda.demo.modelo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Cliente")
public class Cliente implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @Column(name="id_Cliente")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id_Cliente;
	 private String nombres;
	 private String apellidos;
	 private int edad;
	 private String telefono;
	 private String direccion;
	 private String email;
	 
	 
	 public Cliente() {
			super();
		}
	 
	 
	  
	 
	public Cliente(String nombres, String apellidos, int edad, String telefono, String direccion, String email) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}




	public Cliente(Long id_Cliente, String nombres, String apellidos, int edad, String telefono, String direccion,
			String email) {
		super();
		this.id_Cliente = id_Cliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}



	public Long getId_Cliente() {
		return id_Cliente;
	}
	
	public void setId_Cliente(Long id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [id_Cliente=" + id_Cliente + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad="
				+ edad + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + "]";
	}
	
	
	
	
	
}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 