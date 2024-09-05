import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

  public static void main(String[] args) {
//    List<String> colores = new ArrayList<>();
//    colores.add("Celeste");
//    colores.add("Blanco");
//    colores.add("Azul");
//    colores.add("Amarillo");

    // Iterator
//    Iterator<String> iterador = colores.iterator();

//    System.out.println(iterador.hasNext()); // Pregunta si hay un elemento siguiente
//    System.out.println(iterador.next()); // Primer elemento
//    System.out.println(iterador.next()); // Segundo elemento
//    System.out.println(iterador.next()); // Tercer elemento

    // Internamente usa la interfaz Iterable
    // for (String color: colores) {
    //   System.out.println(color);
    // }

    // Bucles
    // int flag = 20; // 1. Inicializamos la flag (bandera)
    // int limite = 5;

    // while(flag < limite) { // 2. Realiza una comparación / validación
      // System.out.println(flag);

      // flag = flag + 1;
      // flag += 1;
      // flag++; // 3. Realiza una acción en cada vuelta
    // }

    // do {
    //  System.out.println(flag);
    //  flag++;
    // } while (flag < limite);

    // For
//    String[] nombres = new String[6];
//
//    nombres[0] = "Juan";
//    nombres[1] = "Mariano";
//    nombres[2] = "Sebastian";
//    nombres[3] = "Mariano";
//    nombres[4] = "Liliana";
//    nombres[5] = "Mariano";
//
//    List<Integer> marianoIndexes = new ArrayList<>();

    // 1. Inicializacion; 2. Condicion; 3. Finalizacion
//    for (int i = 0; i < nombres.length; i++) {
//      // System.out.println(nombres[i]);
//      if (nombres[i] == "Mariano") {
//        marianoIndexes.add(i);
//      }
//    }
//    System.out.println(marianoIndexes);
//
//    for(String nombre: nombres) {
//      System.out.println(nombre);
//    }

    // Foreach
    List<String> colores = new ArrayList<>();
    colores.add("Celeste");
    colores.add("Blanco");
    colores.add("Azul");
    colores.add("Amarillo");

    colores.forEach(color -> {
      if ((color == "Blanco" || color == "Celeste") && color != "Azul") {
        System.out.println("Aguante Argentina");
      }
    });
  }

}
