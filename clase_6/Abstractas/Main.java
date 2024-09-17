package Abstractas;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Grafico c = new Circulo(10, 5, "red");
    Rectangulo r = new Rectangulo(5, 10);

    r.dibujar();
    c.dibujar();

    AbstractList<Grafico> lista = new ArrayList<Grafico>();

    lista.add(c);
    lista.add(r);
    lista.add(new Rectangulo(50, 30));

    for(Grafico g: lista) {
      g.dibujar();
    }
  }
}
