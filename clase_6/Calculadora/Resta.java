package Calculadora;

public abstract class Resta {

  public static double restar(double a, double b) {
    return a - b;
  }

  public static double restar(double[] numeros) {
    double result = 0;

    for(double numero: numeros) {
      result -= numero;
    }

    return result;
  }
}
