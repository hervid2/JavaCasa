import java.util.Scanner;

public class EstructuraControlSwitch {
    public static void main(String[] args) {
        // ¿Qué tipo de bebida te gusta? Estructura SWITCH:
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la máquina expendedora de bebidas");
        System.out.println("----------------------------------------------");
        System.out.println("Elegí una opción de las siguientes: ");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Buena elección, de paso combina con el curso de Java de Sergie Code");
                break;
            case 2:
                System.out.println("Debés ser Argetino, Uruguayo o Paraguayo");
                break;
            case 3:
                System.out.println("Tené cuidado con el azucar");
                break;
            case 4:
                System.out.println("Si tomaste Vino, no manejés por favor");
                break;
            default:
                System.out.println("Opción no válida, ingresá un número válido!");
                break;
        }
        System.out.println("Disfrutá de tu bebida!");
        teclado.close();
    }
}

    
/* 
        // ¿Qué tipo de bebida te gusta? Estructura SWITCH:

        String bebida = "Café";

        switch (bebida) {
            case "Café":
                System.out.println("Buena elección, de paso combina con el curso de Java de Sergie Code");
                break;
            case "Mate":
                System.out.println("Debés ser Argetino, Uruguayo o Paraguayo");
                break;
            case "Gaseosa":
                System.out.println("Tené cuidado con el azucar");
                break;
            case "Vino":
                System.out.println("Si tomaste Vino, no manejés por favor");
                break;
            default:
                System.out.println("Disfrutá de tu bebida");
                break;
        }
    }
}

*/
// -------------------------------------------------
/*
 * Estructura if/else:
 * 
 * if (bebida == "Café") {
 * System.out.
 * println("Buena elección, de paso combina con el curso de Java de Sergie Code"
 * );
 * } else if (bebida == "Mate") {
 * System.out.println("Debés ser Argetino, Uruguayo o Paraguayo");
 * } else if (bebida == "Gaseosa") {
 * System.out.println("Tené cuidado con el azucar");
 * } else if (bebida == "Vino") {
 * System.out.println("Si tomaste Vino, no manejés por favor");
 * } else{
 * System.out.println("Disfrutá de tu bebida");
 * }
 * }
 * }
 * 
 */