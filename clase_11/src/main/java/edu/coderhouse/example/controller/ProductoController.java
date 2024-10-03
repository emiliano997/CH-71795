package edu.coderhouse.example.controller;

import edu.coderhouse.example.entity.Producto;
import edu.coderhouse.example.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

  @Autowired
  private ProductoService service;

  public ProductoController(ProductoService service) {
    this.service = service;
  }

  @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Iterable<Producto>> getAll() {
    Iterable<Producto> productos = service.getProductos();
    return ResponseEntity.ok(productos);
  }

  @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Optional<Producto>> getById(@PathVariable Long id) {
    Optional<Producto> producto = service.getById(id);

    if (producto.isPresent()) {
      // Si el producto existe
      return ResponseEntity.ok(producto);
    } else {
      // Si el producto no existe
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Producto> create(@RequestBody Producto producto) {
    try {
      Producto nuevoProducto = service.save(producto);
      return ResponseEntity.ok(nuevoProducto);
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseEntity.internalServerError().build();
    }
  }
}
