import java.util.Scanner;

public class AhorcadoGame {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Declaraciones y asignaciones:
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arrays:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control iterativa (Bucle):
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.println(letrasAdivinadas[i]);
        }

        // Estructura de control iterativa (Bucle):
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("introduce una letra por favor: ");

            // Usamos la clase teclado para pedir una letra:
            char letra = Character.toLowerCase(teclado.next().charAt(0));
           
            boolean letraCorrecta = false;

            // Estructura de control condicional:
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("!Incorrecto! te quedan " + (intentosMaximos - intentos) + " intentos.");

            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("!Felicidades, has adivinado la palabra secreta: " + palabraSecreta);

            }
        }

        if (!palabraAdivinada) {
            System.out.println("¡Qué pena, te has quedado sin intentos! GAME OVER");

        }
        teclado.close();
    }
}
