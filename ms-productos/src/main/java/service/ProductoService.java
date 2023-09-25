package com.example.msproductos.service;

import com.example.msproductos.entity.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> listarProductos();
    Producto obtenerProductoPorId(Long id);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);
}