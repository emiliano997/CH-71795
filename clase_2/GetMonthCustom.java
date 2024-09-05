import java.util.Scanner;

public class GetMonthCustom {

    public static void main(String[] args) {
        // Obtener nombre del mes
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre del mes: ");
        String nombreMes = sc.nextLine();

        int numeroMes;

        switch (nombreMes.toLowerCase()) {
            case "enero":
                numeroMes = 1;
                break;
            case "febrero":
                numeroMes = 2;
                break;
            case "marzo":
                numeroMes = 3;
                break;
            case "abril":
                numeroMes = 4;
                break;
            case "mayo":
                numeroMes = 5;
                break;
            case "junio":
                numeroMes = 6;
                break;
            case "julio":
                numeroMes = 7;
                break;
            case "agosto":
                numeroMes = 8;
                break;
            case "septiembre":
                numeroMes = 9;
                break;
            case "octubre":
                numeroMes = 10;
                break;
            case "noviembre":
                numeroMes = 11;
                break;
            case "diciembre":
                numeroMes = 12;
                break;
            default:
                numeroMes = 0;
                break;
        }

        if (numeroMes == 0) {
            System.out.println("Mes no válido: " + nombreMes);
        } else {
            System.out.println("El numero del mes " + nombreMes.toLowerCase() + " es: " + numeroMes);
        }

        sc.close();
    }
}