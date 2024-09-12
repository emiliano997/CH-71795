package Herencia;

public class Gato extends Animal {

  String tipo;
  boolean isAmigable;

  public Gato(String nombre, int edad, double peso, double size, String tipo, boolean isAmigable) {
    super(nombre, edad, peso, size);
    this.tipo = tipo;
    this.isAmigable = isAmigable;
  }

  public Gato() {}

  public void rasguniar() {
    System.out.println("El gato está rasguñando");
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public boolean isAmigable() {
    return isAmigable;
  }

  public void setAmigable(boolean amigable) {
    isAmigable = amigable;
  }
}
