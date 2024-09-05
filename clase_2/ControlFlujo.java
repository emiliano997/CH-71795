import java.time.LocalDate;
import java.util.Random;

public class ControlFlujo {
    public static void main(String[] args) {
        // Ingreso por edad
//        int edad = (int) (Math.random() * 30) + 1;
//
//        System.out.println(edad);
//
//        if (edad < 18) {
//            System.out.println("Sos menor de edad. No podés pasar");
//        } else {
//            System.out.println("Sos mayor de edad. Bienvenido");
//        }

        // Obtener mes actual
//        int mes = (int) (Math.random() * 12) + 1;

//        if (mes == 1) {
//            System.out.println("Es enero");
//        } else if (mes == 2) {
//            System.out.println("Es febrero");
//        } else if (mes == 3) {
//            System.out.println("Es marzo");
//        }

//        String nombreMes;
//
//        switch(mes) {
//            case 1:
//                nombreMes = "Enero";
//                break;
//            case 2:
//                nombreMes = "Febrero";
//                break;
//            case 3:
//                nombreMes = "Marzo";
//                break;
//            case 4:
//                nombreMes = "Abril";
//                break;
//            case 5:
//                nombreMes = "Mayo";
//                break;
//            case 6:
//                nombreMes = "Junio";
//                break;
//            case 7:
//                nombreMes = "Julio";
//                break;
//            case 8:
//                nombreMes = "Agosto";
//                break;
//            case 9:
//                nombreMes = "Septiembre";
//                break;
//            case 10:
//                nombreMes = "Octubre";
//                break;
//            case 11:
//                nombreMes = "Noviembre";
//                break;
//            case 12:
//                nombreMes = "Diciembre";
//                break;
//            default:
//                nombreMes = "Mes no válido";
//        }
//
//        System.out.println(nombreMes);
//
//        String nombre = "Homero";
//
//        switch (nombre) {
//            case "Emiliano":
//            case "Maximiliano":
//            case "Emilio":
//                System.out.println("Puede pasar");
//                break;
//            case "Homero":
//                System.out.println("No se permiten homeros");
//                break;
//            default:
//                System.out.println("Dejame en paz");
//        }

        // Operador ternario
//        String nombre = "John";
//
//        boolean isArgentino = nombre == "Emiliano";
//
//        String nacionalidad = isArgentino ? "argentina" : "otro pais";
//
//        int valorTotal = isArgentino ? 123 : 321;
//
//        System.out.println(nombre + " es de " + nacionalidad);
//        System.out.println("Cantidad total: " + valorTotal);

        // Numeros aleatorios
        int numero = (int) (Math.random() * 40) + 1;

        System.out.println(numero);
    }
}
