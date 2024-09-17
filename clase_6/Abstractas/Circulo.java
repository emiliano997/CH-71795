package Abstractas;

public class Circulo extends Grafico implements Design, Animation{

  String color;

  public Circulo () {}

  public Circulo (int x, int y, String color) {
    super(x, y);
    this.color = color;
  }

  @Override
  void dibujar() {
    System.out.println("Dibujando Circulo");
  }

  @Override
  void redimensionar() {
    System.out.println("Redimensionando Circulo");
  }

  @Override
  public void pintarLineas() {
    System.out.println("Pintando las lineas del circulo con el color " + this.color);
  }

  @Override
  public void rellenar() {
    System.out.println("Rellenando circulo con el color " + this.color);
  }

  @Override
  public void showAnimation(int duration, String animation) {
    System.out.println("Esta realizando la animacion " + animation + " por " + duration + "ms");
  }

  @Override
  public void changeAnimation(String animation) {}
}
