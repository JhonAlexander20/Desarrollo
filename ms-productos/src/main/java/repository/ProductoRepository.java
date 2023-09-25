package com.example.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msproductos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}