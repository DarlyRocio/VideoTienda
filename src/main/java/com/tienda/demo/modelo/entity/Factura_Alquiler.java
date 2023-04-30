package com.tienda.demo.modelo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity 
@Table(name="Factura_Alquiler")
public class Factura_Alquiler implements Serializable  {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id_factura;
	  private int idcliente; 		
	  private LocalDateTime fecha_alquiler;
	  private LocalDateTime fecha_entrega;
	  private double subtotal;
	  private double total;
	  
	  @ManyToOne
	  @JoinColumn(name="id_cliente")
	  private Cliente cliente;
	  
	    

	public Factura_Alquiler() {
		super();
	}



	public Factura_Alquiler(int idcliente, LocalDateTime fecha_alquiler, LocalDateTime fecha_entrega, double subtotal,
			double total, Cliente cliente) {
		super();
		this.idcliente = idcliente;
		this.fecha_alquiler = fecha_alquiler;
		this.fecha_entrega = fecha_entrega;
		this.subtotal = subtotal;
		this.total = total;
		this.cliente = cliente;
	}



	public Factura_Alquiler(Long id_factura, int idcliente, LocalDateTime fecha_alquiler, LocalDateTime fecha_entrega,
			double subtotal, double total, Cliente cliente) {
		super();
		this.id_factura = id_factura;
		this.idcliente = idcliente;
		this.fecha_alquiler = fecha_alquiler;
		this.fecha_entrega = fecha_entrega;
		this.subtotal = subtotal;
		this.total = total;
		this.cliente = cliente;
	}



	public Long getId_factura() {
		return id_factura;
	}



	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}



	public int getIdcliente() {
		return idcliente;
	}



	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}



	public LocalDateTime getFecha_alquiler() {
		return fecha_alquiler;
	}



	public void setFecha_alquiler(LocalDateTime fecha_alquiler) {
		this.fecha_alquiler = fecha_alquiler;
	}



	public LocalDateTime getFecha_entrega() {
		return fecha_entrega;
	}



	public void setFecha_entrega(LocalDateTime fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}



	public double getSubtotal() {
		return subtotal;
	}



	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public String toString() {
		return "Factura_Alquiler [id_factura=" + id_factura + ", idcliente=" + idcliente + ", fecha_alquiler="
				+ fecha_alquiler + ", fecha_entrega=" + fecha_entrega + ", subtotal=" + subtotal + ", total=" + total
				+ ", cliente=" + cliente + "]";
	}
	
	


	



	
	
	
	 	  

}
