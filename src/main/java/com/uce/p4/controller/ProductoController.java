package com.uce.p4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.p4.repository.modelo.Producto;
import com.uce.p4.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productoNuevo")
    // Comentario
    public String obtenerProducto(Producto producto) {
        return "producto_nuevo";

    }

    @PostMapping("/insertar")
    public String insertarProducto(Producto producto, Model modelo) {

        this.productoService.ingresarProductos(producto);

        return "registrado";
    }

    // Buscar Cedula
	@GetMapping("/obtenerStock")
	public String obtenerStock(Producto producto) {
		return "producto_stock";

	}

	@GetMapping("/consultar")
	public String buscarProducto(Producto producto ,Model model
			) {
		
		Producto p = this.productoService.consultarStock(producto.getCodigoBarras());
        model.addAttribute("lista", p);
		return "producto_mostrar_stock";
	}

}
