package edu.coderhouse.example.service;

import edu.coderhouse.example.entity.Producto;
import edu.coderhouse.example.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

  @Autowired // Le indicamos que la propiedad va a ser inyectada
  private ProductoRepository repository;

  public ProductoService(ProductoRepository repository) {
    this.repository = repository;
  }

  public Producto save(Producto producto) {
    return repository.save(producto);
  }

  public List<Producto> getProductos() {
    return repository.findAll();
  }

  public Optional<Producto> getById(Long id) {
    return repository.findById(id);
  }
}
