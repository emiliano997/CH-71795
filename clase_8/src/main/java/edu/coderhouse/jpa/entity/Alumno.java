package edu.coderhouse.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUMNO")
public class Alumno {

  public Alumno() {}

  public Alumno(String nombre, String apellido, int dni, int legajo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.legajo = legajo;
  }

  @Column(name = "NOMBRE")
  private String nombre;

  @Column(name = "APELLIDO")
  private String apellido;

  @Column(name = "DNI")
  private int dni;

  @Column(name = "LEGAJO")
  private int legajo;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public int getLegajo() {
    return legajo;
  }

  public void setLegajo(int legajo) {
    this.legajo = legajo;
  }
}
