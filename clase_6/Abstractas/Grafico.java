package Abstractas;

public abstract class Grafico {

  int x, y;

  public Grafico () {}

  public Grafico(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void moverA(int x, int y) {
    System.out.println("Moviendo a " + x + ", " + y);
  }

  abstract void dibujar();

  abstract void redimensionar();
}
