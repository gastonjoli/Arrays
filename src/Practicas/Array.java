package Practicas;
/*
ARRAY : o tambien conocido como arreglo en JAVA es una coleccion de datos
de un mismo tipo. El tamaño de los arrays se declara en un primer momento
y no se puede cambiar luego durante la ejecucion del programa.

ARRAY UNIDIMENSIONAL:
Tipo_de_variable[]    Nombre_del_array=new    Tipo_de_variable[domension];

EJEMPLOS:

-int[] edad = new int[4];
-long[] edad = new long[4];
-float[] estatura = new float[3];
-double[] estatura = new double[3];
-boolean[] estado = new boolean[5];
-char[] sexo = new char[2];
-String[] nombre = new String[2];

------------------------------------

PARA ASIGNARLE VALOR AL ARRAY:

situacion a:

numeros [0] = 5;
numeros [1] = 7;
numeros [9] = 9

------------------------------

situacion b:

int[] numeros = {5,7,9};

 */
public class Array {
    public static void main(String[] args) {
        int[] numeros = new int[3];

         numeros[0] = 7;
         numeros[1] = 10;
         numeros[2] = 13;

        //Tambien se puede darle valores a las variables de la siguiente forma:
        // (para probar sacar comentario):


        //int[] numeros = {5,9,10};

        // (comentando linea 39/41/42/43)

        //para mostrarlo en pantalla los array van de la mano de los bucles.

        for(int i=0;i<3;i++){
            System.out.println(numeros[i]);
        }







    }
}
