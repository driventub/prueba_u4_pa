package com.uce.p4.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.p4.repository.modelo.DetalleVenta;
import com.uce.p4.repository.modelo.ReporteVentas;

public interface IDetalleVentaRepo {
	public DetalleVenta buscar(Integer id);
	public void actualizar(DetalleVenta deve);
	public void eliminar(Integer id);
	public void insertar(DetalleVenta deve);
	public List<ReporteVentas> buscarReporte(LocalDateTime fechaVenta, String categoria, Integer cantidad);
}