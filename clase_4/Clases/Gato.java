package Clases;

class Gato {

  // Propiedades | Atributos
  // Modificador default
  String nombre;
  String raza;
  int edad;
  double peso;
  boolean estaCastrado;

  // Metodos | Acciones | Verbos
  public void maullar() {
    System.out.println("El gato está maullando");
  }

  public void jugar() {
    System.out.println("El gato está jugando");
  }

  public void huirDelPerro() {
    Perro firu = new Perro();
    firu.setEdad(2);
//    System.out.println(firu.edad);
    System.out.println(firu.getEdad());
  }

  // Getters y Setters
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

  public boolean isEstaCastrado() {
    return estaCastrado;
  }

  public void setEstaCastrado(boolean estaCastrado) {
    this.estaCastrado = estaCastrado;
  }
}
