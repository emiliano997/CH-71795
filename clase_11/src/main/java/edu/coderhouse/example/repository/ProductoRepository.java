package edu.coderhouse.example.repository;

import edu.coderhouse.example.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> { }
