public class OperacionesJava {
    public static void main(String[] args) {

        // Operadores: Símbolos que sirven para hacer
        // operaciones con variables o valores aritméticos:

        int a = 12;
        int b = a % 2;
        //El operador "%" sirve para saber si un # es par o impar 
        //ya que arroja el residuo como resultado al dividir con 2
        System.out.println(b);
        //-----------------------------

        int c = 5;
        c = 10;
        c += 15;
        c += 25;
        c -= 15;
        c *=2;
        c /= 10;
        c++;
        // El operador "=" sirve de asignación:
        System.out.println(c);
        //----------------------------------------

    }
}