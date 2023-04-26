package com.tienda.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "clientes")
public class Clientes {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private Long idCliente;
	 private String nombres;
	 private String apellidos;
	 private int edad;
	 private String telefono;
	 private String direccion;
	 private String email;
	 
	  
	 
	public Clientes() {
		super();
	}
	
	
	public Clientes(Long idCliente, String nombres, String apellidos, int edad, String telefono,
			String direccion,String email) {
		super();
		this.idCliente = idCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}


	
	public Clientes(String nombres, String apellidos, int edad, String telefono, String direccion, String email) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}


	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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
		return "Clientes [idCliente=" + idCliente + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad="
				+ edad + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + "]";
	}


	
	
	 
	
	 
	 
	 
	 
	

}
