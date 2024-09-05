import java.util.ArrayList;
import java.util.List;

public class Actividad {

  public static void main(String[] args) {
    // Crear la lista
    List<Integer> numeros = new ArrayList<>();

    // Llenamos la lista con numeros aleatorios
    for (int i = 0; i < 10; i++) {
      int random = (int) (Math.random() * 100) + 1;
      numeros.add(random);
    }

    for(int numero: numeros) {
      System.out.println(numero);
      if (numero % 3 == 0) {
        break;
      }
    }

    System.out.println(numeros);
  }
}
