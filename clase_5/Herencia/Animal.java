package Herencia;

public class Animal {

  String nombre;
  int edad;
  double peso;
  double size;

  // Constructor
  public Animal () {}

  // Constructor
  public Animal(String nombre, int edad, double peso, double size) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.size = size;
  }

  // Metodo
  public void hacerRuido() {
    System.out.println("El animal está haciendo ruido");
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }
}
