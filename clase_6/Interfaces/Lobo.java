package Interfaces;

public class Lobo implements Mascota {

  String nombre;
  String raza;
  boolean esDomestico;

  public Lobo() {}

  public Lobo(String nombre, String raza, boolean esDomestico) {
    this.nombre = nombre;
    this.raza = raza;
    this.esDomestico = esDomestico;
  }

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
    System.out.println("Le sacó la pierna a alguien");
  }

  @Override
  public boolean esAmistoso() {
    return false;
  }
}
