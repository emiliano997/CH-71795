public class ArrayExample {

  public static void main(String[] args) {
    // Declaración e inicializacion de arrays
    int[] listaNumeros;
    String[] listaNombres = new String[5];
    int[] listaNumeros2 = {
            200, 500, 300
    };

    // int cantidad = 5; // Obtener el largo del array del usuario
    // listaNumeros = new int[cantidad];

    // Asignación de elementos
    listaNombres[0] = "Anderson";
    listaNombres[1] = "Fulanito";
    listaNombres[2] = "Roberto";
    listaNombres[3] = "Alberto";
    listaNombres[4] = "Santiago";

    // Acceso a elementos
    System.out.println("El primer nombre de la lista es: " + listaNombres[0]);
    System.out.println("El segundo nombre de la lista es: " + listaNombres[1]);
    System.out.println("El tercero nombre de la lista es: " + listaNombres[2]);
    System.out.println("El cuarto nombre de la lista es: " + listaNombres[3]);
    System.out.println("El quinto nombre de la lista es: " + listaNombres[4]);
  }
}
