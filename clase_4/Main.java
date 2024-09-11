import Clases.*;

public class Main {

  public static void main(String[] args) {
    // Perro firu = new Perro(); // Objeto

    // Definimos las propiedades de firu
//    firu.setNombre("Firulais");
//    firu.setEdad(2);
//    firu.setPeso(6.80);
//    firu.setRaza("Doberman");
//    firu.setEstaVacunado(true);

    // Obtener las propiedades de firu
//    System.out.println("Nombre: " + firu.getNombre());
//    System.out.println("Edad: " + firu.getEdad() + " años");
//    System.out.println("Peso: " + firu.getPeso() + "kg");
//    System.out.println("Raza: " + firu.getRaza());
//    System.out.println("¿Está vacunado? " + (firu.isEstaVacunado() ? "Si" : "No"));

    // Metodos estáticos (static)
//    Perro.juntarPerros(10); // cantidad: Argumentos
//    String mensaje = Perro.juntarPerros(5, "Hola mundo");
//    System.out.println(mensaje);
    // Math.random();

    // Gato michi = new Gato(); // Da error porque no está public

    // Pasaje de parametros
    int numero = 10; // Espacio en memoria 1
    System.out.println("Variable original: " + numero);

    incrementar(numero); // Aca pasamos el valor de 10

    System.out.println("Variable luego de la funcion: " + numero);

    // System.out.println(mensaje);
    System.out.println(Perro.PATAS);
  }

  public static void incrementar(int nuevoNumero) { // Espacio en memoria 2
    System.out.println("Variable antes de ser modificada: " + nuevoNumero);
    nuevoNumero = nuevoNumero * 20;
    String mensaje = "Este es un nuevo mensaje";
    System.out.println("Variable luego de ser modificada: " + nuevoNumero);
  }
}
