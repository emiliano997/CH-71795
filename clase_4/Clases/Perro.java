package Clases;

public class Perro {

  // Propiedades | Atributos
  // Variables de instancia
  private String nombre;
  private String raza;
  private int edad;
  private double peso;
  private boolean estaVacunado;

//  public static final int PATAS = 4;

  public static final int PATAS;
  static {
    PATAS = 4;
  }

  // Métodos | Acciones | Verbos
  public void ladrar() {
    System.out.println("El perro está ladrando");
  }

  public void jugar() {
    System.out.println("El perro está jugando");
  }

  // cantidad: Parámetro
  public static void juntarPerros(int cantidad) {
    System.out.println("Se estan juntando " + cantidad + " perros");
  }

  public static String juntarPerros(int cantidad, String mensaje) {
    return "Se están juntando " + cantidad + " perros. " + mensaje;
  }

  public void perseguirGato() {
    Gato michi = new Gato(); // Variable local
  }

  // Getters | Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    // this: Hace referencia a la instancia (objeto)
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

  public boolean isEstaVacunado() {
    return estaVacunado;
  }

  public void setEstaVacunado(boolean estaVacunado) {
    this.estaVacunado = estaVacunado;
  }
}
