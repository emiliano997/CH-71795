package edu.coderhouse.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nombre", nullable = false)
  private String nombre;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  public Cliente() {}

  public Cliente(Long id, String nombre, String email) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
