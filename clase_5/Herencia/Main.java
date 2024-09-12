package Herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    Perro firu = new Perro("Firulais", 2, 5.8, 0.80, "Pitbul");

//    firu.hacerRuido();
//
    Gato michi = new Gato("Michi", 5, 3.8, 0.60, "Siames", true);
//
//    Animal perroGato = new Perro();
//    perroGato = new Gato();
//
//    List<Animal> listaAnimales = new ArrayList<>();
//    listaAnimales.add(firu);
//    listaAnimales.add(michi);

    // Equals
    Perro firu = new Perro("Firulais", 2, 5.8, 0.80, "Pitbul");

//    Perro otroPerro = firu; // Le asigno la referencia del objeto Firu
    Perro otroPerro = new Perro("Firulais", 2, 5.8, 0.80, "Pitbul");
    if (firu == otroPerro) {
      System.out.println("Su referencia es igual");
    }

//    System.out.println(otroPerro.hashCode());
//    System.out.println(firu.hashCode());
    System.out.println(firu.equals(otroPerro)); // Igualdad de valor
    System.out.println(firu == otroPerro); // Igualdad por referencia

    firu.hacerRuido();
    michi.hacerRuido();
  }
}
