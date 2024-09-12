package Herencia;

import java.util.Objects;

public class Perro extends Animal {
  String raza;

  // Constructor
  public Perro () {}

  public Perro(String nombre, int edad, double peso, double size, String raza) {
    // super -> Constructor de la clase Animal
    super(nombre, edad, peso, size);
    this.raza = raza;
  }

  // Sobreescitrua / Override
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Perro perro = (Perro) o;
    return Objects.equals(raza, perro.raza);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(raza);
  }

  @Override
  public void hacerRuido() {
    System.out.println("El perro está ladrando");
  }

  // Getters y Setters
  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
}
