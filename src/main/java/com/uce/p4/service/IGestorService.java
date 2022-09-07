package com.uce.p4.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.p4.repository.modelo.Producto;
import com.uce.p4.repository.modelo.ReporteVentas;

public interface IGestorService {
    public void realizarVenta(List<Producto> productos, String cedulaCliente, String numeroVenta );

    public List<ReporteVentas> generarReporte(LocalDateTime fechaVenta, String categoria, Integer cantidad);

}
