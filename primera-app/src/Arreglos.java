public class Arreglos {
     
    public static void main (String[]args)throws Exception{
     //DATO IMPORTANTE: El índice se comienza por 0 y no por 1
     
    //Tipodato:--Nombre:-------Índices:-----
        int   [] numeros = {10,20,30,40,50};

        int indice = 0;
        //forEach
        //  un elemento de arreglo
        for (int numero : numeros) {
            System.out.println(numero);
            System.out.println(indice);
            indice++;
            
        }
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }

    }
}
//-------------------------------------------------------------------
/* 
public class Arreglos {
     
    public static void main (String[]args)throws Exception{
     //DATO IMPORTANTE: El índice se comienza por 0 y no por 1
     
    //Tipodato:--Nombre:-------Índices:-----
      
        int   [] numeros = {10,20,30,40,50};

        numeros[2] = 90;
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }

    }
}
*/
//-------------------------------------------------------------------

/*
public class Arreglos {
     
    public static void main (String[]args)throws Exception{
     //DATO IMPORTANTE: El índice se comienza por 0 y no por 1

        int[] numeros=new int [5];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }

    }
}
*/
//-------------------------------------------------------------------
/*
 * public class Arreglos {
     
    public static void main (String[]args)throws Exception{
        //DATO IMPORTANTE: El índice se comienza por 0 y no por 1
   
           int[] numeros=new int [5];
           numeros[0]=1;
           numeros[1]=2;
           numeros[3]=4;
           numeros[4]=5;
   
           System.out.println(numeros[0]);
           System.out.println(numeros[1]);
           System.out.println(numeros[2]);
           System.out.println(numeros[3]);
           System.out.println(numeros[4]);
   
   
   
   
       }
   }
 */

 /*
     * Arreglos(ARRAYS): Estructuras de datos que tienen valores del mismo tipo bajo un
     * mismo nombre.
     * Estos valores se distribuyen secuencialmente en la memoria y se pueden
     * acceder a ellos
     * mediante un índice.
     * /Ls arreglos tambien son llamados "VECTORES O MATRICES!"
     */