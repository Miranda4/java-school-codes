/*
NickName: SieteSiete
ejercicio 13
Tiempo: 00:44
 */
//Se importa Scanner para la lectura de datos
import java.util.Scanner;

class main{
    public static void main(String args[]){
        //Se define y crea  multiplicador tipo integer
        int multiplicador = 0;
        //Se definen y crean los vectores de longitud 10 cada uno
        int[] vectorBase = new int[10], vectorResultados = new int[10];
        //Se crea objeto Scanner para la lectura de los datos
        Scanner objetoScanner = new Scanner(System.in);
        //Primer ciclo iterrativo para la lectura y escritura de cada uno de los datos en el vector
        for(int i = 0; i < 10; i++){
            //Se solicitan los datos
            System.out.println("Ingrese dato "+ i +" del vector");
            //se escriben los datos en el vector
            vectorBase[i] = objetoScanner.nextInt();
        }
        //Se solicita multiplicador
        System.out.println("Ingrese un unico multiplicador para cada uno de los elementos del vector");
        //Se esribe el valor de "multiplicador"
        multiplicador = objetoScanner.nextInt();
        //Se crea ciclo iterativo para multiplicar y mostar el producto del vector por el multiplicador por lineas separadas
        for(int i = 0; i < 10; i++){
            vectorResultados[i] = vectorBase[i] * multiplicador;
            System.out.println(vectorResultados[i]);
        }
    }
}