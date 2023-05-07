package com.tienda.demo.modelo.entity;

import java.io.Serializable;
import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="videojuego")
public class Videojuego implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_videojuego")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_videojuego;
	private String titulo;
	private double precio_alquiler;
	private int stock;
	private LocalDate fecha_lanzamiento;
	private String plataforma;
	
	@ManyToOne 
	@JoinColumn(name="id_director")
	private Director director;
	
	@ManyToOne
	@JoinColumn(name="id_productor")
	private Productor productor;
	
	@ManyToOne
	@JoinColumn(name="id_protagonista")
	private Protagonista protagonista;
	
	@ManyToOne
	@JoinColumn(name="id_marca")
	private Marca marca;

	
	public Videojuego() {
		super();
	}


	public Videojuego(String titulo, double precio_alquiler, int stock, LocalDate fecha_lanzamiento, String plataforma,
			Director director, Productor productor, Protagonista protagonista, Marca marca) {
		super();
		this.titulo = titulo;
		this.precio_alquiler = precio_alquiler;
		this.stock = stock;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.plataforma = plataforma;
		this.director = director;
		this.productor = productor;
		this.protagonista = protagonista;
		this.marca = marca;
	}


	public Videojuego(Long id_videojuego, String titulo, double precio_alquiler, int stock, LocalDate fecha_lanzamiento,
			String plataforma, Director director, Productor productor, Protagonista protagonista, Marca marca) {
		super();
		this.id_videojuego = id_videojuego;
		this.titulo = titulo;
		this.precio_alquiler = precio_alquiler;
		this.stock = stock;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.plataforma = plataforma;
		this.director = director;
		this.productor = productor;
		this.protagonista = protagonista;
		this.marca = marca;
	}


	public Long getId_videojuego() {
		return id_videojuego;
	}


	public void setId_videojuego(Long id_videojuego) {
		this.id_videojuego = id_videojuego;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPrecio_alquiler() {
		return precio_alquiler;
	}


	public void setPrecio_alquiler(double precio_alquiler) {
		this.precio_alquiler = precio_alquiler;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public LocalDate getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}


	public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public Director getDirector() {
		return director;
	}


	public void setDirector(Director director) {
		this.director = director;
	}


	public Productor getProductor() {
		return productor;
	}


	public void setProductor(Productor productor) {
		this.productor = productor;
	}


	public Protagonista getProtagonista() {
		return protagonista;
	}


	public void setProtagonista(Protagonista protagonista) {
		this.protagonista = protagonista;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Videojuego [id_videojuego=" + id_videojuego + ", titulo=" + titulo + ", precio_alquiler="
				+ precio_alquiler + ", stock=" + stock + ", fecha_lanzamiento=" + fecha_lanzamiento + ", plataforma="
				+ plataforma + ", director=" + director + ", productor=" + productor + ", protagonista=" + protagonista
				+ ", marca=" + marca + "]";
	}
	
	
	

	       

}
