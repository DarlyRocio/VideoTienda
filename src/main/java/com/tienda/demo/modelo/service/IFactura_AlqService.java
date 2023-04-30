package com.tienda.demo.modelo.service;

import java.util.List;

import com.tienda.demo.modelo.entity.Factura_Alquiler;

public interface IFactura_AlqService {

	public List<Factura_Alquiler> listarFactura();

	public void  guardarFactura(Factura_Alquiler facAlquiler);

	public void eliminarFacturabyId(Long id);

	public Factura_Alquiler buscarFacturabyId(Long id);
	
}
