
//Metodos usados con la clase "String"

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "    Este es un texto asignado a una variable String";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);

        char caracter = texto.charAt(8);
        System.out.println(caracter);

        String subString = texto.substring(6, 16);
        System.out.println(subString);

        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int indice = texto.indexOf("variable");
        System.out.println(indice);

        String reemplazado = texto.replace("texto", "parrafo");
        System.out.println(reemplazado);

        boolean contiene = texto.contains("asignado");
        System.out.println("¿Tiene la palabra asignado?" + contiene);

        // Este es un metodo que se usa con la clase String
        // para suprimir espacios en la cadena de texto
        String sinespacios = texto.trim();
        System.out.println(sinespacios);
    }
}

