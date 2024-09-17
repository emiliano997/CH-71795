package Abstractas;

public class Rectangulo extends Grafico {

  public Rectangulo(int x, int y) {
    super(x, y);
  }

  @Override
  void dibujar() {
    System.out.println("Dibujando rectangulo");
  }

  @Override
  void redimensionar() {
    System.out.println("Redimensionando rectangulo");
  }
}
