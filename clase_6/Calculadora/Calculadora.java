package Calculadora;

public class Calculadora implements Suma, Division {
  @Override
  public int suma(int a, int b) {
    return a + b;
  }

  @Override
  public double suma(double a, double b) {
    return a + b;
  }

  @Override
  public float suma(float a, float b) {
    return a + b;
  }

  @Override
  public long suma(long a, long b) {
    return a + b;
  }

  @Override
  public double division(int a, int b) throws ArithmeticException {
    return a / b;
  }

  @Override
  public double division(double a, double b) throws ArithmeticException {
    return a / b;
  }

  @Override
  public double division(float a, float b) throws ArithmeticException {
    return a / b;
  }

  @Override
  public double division(long a, long b) throws ArithmeticException {
    return a / b;
  }
}
