package Interfaces;

public interface Mascota {

  void jugar();
  boolean esAmistoso();

  static void adoptar() {
    System.out.println("Este animal ha sido adoptado");
  };
}
