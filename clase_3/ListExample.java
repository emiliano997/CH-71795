import java.util.ArrayList;
import java.util.List;

public class ListExample {
  public static void main(String[] args) {
    // Lists
//    List<String> colores = new ArrayList<>();
//    colores.add("Celeste");
//    colores.add("Blanco");
//    colores.add("Azul");
//    colores.add("Verde");
//
//    List<String> colores2 = new ArrayList<>();
//    colores2.add("Azul");
//    colores2.add("Verde");

    // containsAll - Devuelve true verificando que lo que este en colores2 este en colores
    // boolean contiene = colores.containsAll(colores2);
    // System.out.println(contiene);

    // addAll - Agrega a colores los elementos que esten en colores 2
    // colores.addAll(colores2);
    // System.out.println(colores);

    // removeAll - Elimina los elementos de colores que coincidan con el array de colores2
    // colores.removeAll(colores2);
    // System.out.println(colores);

    // retainAll - Elimina el resto de los elementos de colores que no coincidan con colores2
    // colores.retainAll(colores2);
    // System.out.println(colores);

    // clear - Limpia la lista
    // colores.clear();
    // System.out.println(colores);

    // Acceso a los elementos
    // colores.add("Amarillo"); // Agrega elementos
    // System.out.println(colores.get(3)); // Obtiene el elemento
    // colores.set(3, "Magenta"); // Reemplaza el elemento en el indice indicado
    // System.out.println(colores.get(3)); // Obtiene el elemento

    // System.out.println(colores);
    // colores.remove(3); // Elimina el elemento
    // System.out.println(colores);

    // Operaciones de busqueda
    List<String> colores = new ArrayList<>();
    colores.add("Celeste");
    colores.add("Blanco");
    colores.add("Azul");
    colores.add("Celeste");
    colores.add("Magenta");
    colores.add("Celeste");

    // indexOf - Devolvernos el indice del elemento si coincide. Sino coincide devuelve -1
    // int resultado = colores.indexOf("Magenta");

    // lastIndexOf - Nos devuelve el indice de la ultima coincidencia. Sino lo encuentra, devuelve -1
    int resultado = colores.lastIndexOf("Marron");
    String mensaje = resultado == -1 ? "No se encontro el elemento" : "El elemento esta en la posicion " + resultado;
    System.out.println(mensaje);
  }
}
