/*
Autor: SieteSiete
nombre: Ejercicio 14
Tiempo: 00:38
*/
//se importan Scanner para lectura de datos
import java.util.Scanner;
//se crea la "struct" ALumno
class Alumno{
    public String campoCadena; 
    public int campoEntero;  
    public float campoFlotante; 
};

class main{
    public static void main(String args[]){
        //se crea objeto de Alumno
        Alumno alumno = new Alumno();
        //se inicializa Scanner para lectura de datos
        Scanner leer = new Scanner(System.in);
        //se solicitan e ingresan datos
        System.out.println("Campo cadena: ");
        alumno.campoCadena = leer.nextLine();
        System.out.println("Campo entero: ");
        alumno.campoEntero = leer.nextInt();
        System.out.println("Campo flotante: ");
        alumno.campoFlotante = leer.nextFloat();
        //se muestran los datos solicitados
        System.out.println("Campo cadena: " + alumno.campoCadena);
        System.out.println("Campo entero:" + alumno.campoEntero);
        System.out.println("Campo flotante: " + alumno.campoFlotante);
    }
}