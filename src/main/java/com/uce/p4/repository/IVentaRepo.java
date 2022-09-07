package com.uce.p4.repository;

import com.uce.p4.repository.modelo.Venta;

public interface IVentaRepo {
	public Venta buscar(Integer id);
	public void actualizar(Venta vent);
	public void eliminar(Integer id);
	public void insertar(Venta vent);

	
}