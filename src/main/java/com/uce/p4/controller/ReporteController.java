
package com.uce.p4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.p4.repository.modelo.DetalleVenta;
import com.uce.p4.repository.modelo.ReporteVentas;
import com.uce.p4.service.IGestorService;

@Controller

@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    private IGestorService gestorService;

    @GetMapping("/consultar")
    public String buscar(DetalleVenta detalleVenta, Model modelo) {
        List<ReporteVentas> lista = this.gestorService.generarReporte(detalleVenta.getVenta().getFecha(),
                detalleVenta.getProducto().getCategoria(), detalleVenta.getCantidad());
        modelo.addAttribute("lista", lista);

        return "reporte_mostrar";
    }

    @GetMapping("/buscarVenta")
    public String generarReporte(DetalleVenta detalleVenta) {
        return "reporte_buscar";
    }

}