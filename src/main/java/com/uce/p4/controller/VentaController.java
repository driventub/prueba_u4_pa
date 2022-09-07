package com.uce.p4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.p4.repository.modelo.Producto;
import com.uce.p4.repository.modelo.Venta;
import com.uce.p4.service.IGestorService;

@Controller

@RequestMapping("/ventas")
public class VentaController {
	
    @Autowired
    private IGestorService gestorService;

	List<Producto> lista = new ArrayList<>();



	@PostMapping("/insertar")
	public String insertarVenta(Venta venta, BindingResult result, Model modelo) {
		
		this.gestorService.realizarVenta(lista, venta.getCedulaCliente(), venta.getNumero());
		
		return "registrado";
	}

	@GetMapping("/nuevaVenta")
	public String obtenerVenta(Venta venta, Producto producto) {
		return "venta_nueva";

	}

	@GetMapping("/guardarProducto")
	public String guardarProducto(Producto producto) {

		this.lista.add(producto);
		return "redirect:/ventas/nuevaVenta";
	}


}