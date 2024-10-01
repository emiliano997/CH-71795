package edu.coderhouse.example.controllers;

import edu.coderhouse.example.entities.Cliente;
import edu.coderhouse.example.services.ClienteService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

  @Autowired
  private ClienteService service;

  public ClienteController(ClienteService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Cliente>> getClientes() {
    // Devuelvo los clientes
    return ResponseEntity.ok(this.service.getClientes());
  }

  @PostMapping(consumes = "application/json")
  public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
    this.service.createCliente(cliente);
    return ResponseEntity.ok(cliente);
  }
}
