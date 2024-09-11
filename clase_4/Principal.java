public class Principal {

  public static int numero = 10;

  public static void main(String[] args) {
    System.out.println(numero);

    incrementar();

    System.out.println(numero);
  }

  public static void incrementar() {
    numero += 1;
  }


}
