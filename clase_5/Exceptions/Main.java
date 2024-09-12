package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args) {
    // int nombre = Integer.parseInt("Emiliano");
    // String nombreArchivo = "Mi super archivo";
    // leerArchivo(nombreArchivo);

    try {
      int x = 5;
      int y = 0;

      double resultado = dividir(x, y);

      System.out.println(resultado);
    } catch (ArithmeticException e) {
      throw new RuntimeException(e);
    } finally {
      System.out.println("El programa finalizó");
    }

    System.out.println("Holis");
  }

  public static double dividir(int a, int b) throws ArithmeticException {
    return a / b;
  }

  public static void leerArchivo (String nombreArchivo) {
    try {
      FileInputStream archivoParaLeer = generarArchivo(nombreArchivo);

      if(archivoParaLeer == null) {
        System.out.println("Archivo no encontrado");
      } else {
        // Lee el archivo
      }
    } catch (FileNotFoundException error) {
      error.printStackTrace();
    }
  }

  public static FileInputStream generarArchivo (String nombreArchivo) throws FileNotFoundException {
  File archivo = new File(nombreArchivo);

    FileInputStream archivoCreado = new FileInputStream(archivo);

    return archivoCreado;
  }
}
