package Interfaces;

public class Perro implements Mascota {

  String nombre;
  String raza;
  boolean esDomestico;

  public Perro() {}

  public Perro(String nombre, String raza, boolean esDomestico) {
    this.nombre = nombre;
    this.raza = raza;
    this.esDomestico = esDomestico;
  }

  // Llamar a los metodos de la interface


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public boolean isEsDomestico() {
    return esDomestico;
  }

  public void setEsDomestico(boolean esDomestico) {
    this.esDomestico = esDomestico;
  }

  @Override
  public void jugar() {
    System.out.println("Agarró una ramita");
  }

  @Override
  public boolean esAmistoso() {
    return true;
  }
}
