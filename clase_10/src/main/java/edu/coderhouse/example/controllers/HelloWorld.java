package edu.coderhouse.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class HelloWorld {

  private int count = 0;

  @GetMapping()
  public String saludo() {
    return "Hola mundo";
  }

  @GetMapping("/fecha-actual")
  public String fechaActual() {
    count++;
    return "Fecha Actual: " + LocalDateTime.now() + ". Visitas: " + count;
  }
}
