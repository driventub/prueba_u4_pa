package com.uce.p4.service;

import com.uce.p4.repository.modelo.Producto;

public interface IProductoService {
    public void ingresarProductos(Producto p);

    public Producto consultarStock(String codigo);
}
