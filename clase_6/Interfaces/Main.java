package Interfaces;

public class Main {

  public static void main(String[] args) {
    Perro firu = new Perro("Firulais", "Pitbul", true);
    Lobo wolf = new Lobo("Wolf", "De Bosque", false);

    firu.jugar();
    wolf.jugar();
  }
}
