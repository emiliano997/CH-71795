package Calculadora;

public class Main {

  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    System.out.println(calculadora.suma(3, 5));
    System.out.println(calculadora.suma(3.5, 5.8));
    System.out.println(calculadora.suma(3.90f, 5.20f));
    System.out.println(calculadora.suma((long) 30000, (long) 58888));

    System.out.println(Resta.restar(5, 30));

    double[] numeros = new double[4];
    numeros[0] = 5.21;
    numeros[1] = 5.21;
    numeros[2] = 5.21;
    numeros[3] = 5.21;

    System.out.println(Resta.restar(numeros));

    try {
      System.out.println(calculadora.division(4, 10));
      System.out.println(calculadora.division(4.54, 8.21));
      System.out.println(calculadora.division(4.20f, 10.7f));
      System.out.println(calculadora.division((long) 30000, (long) 58888));
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
  }
}
