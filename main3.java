/*nickName: SieteSiete
ejercicio 12
Tiempo: 00:56
*/

//Se importa la clase Scanner para poder leer datos desde el teclado
import java.util.Scanner;
import java.util.InputMismatchException;
//Se crea la clase main
class main { 
    //Se define la constante
    static final int MAXIMO_ASISTENCIAS = 34;
    //se crea el metodo principal
    public static void main(String[] args){
        //Se definen variables
        float porcAsistencia = 0f;
        int cantFaltas = 0;
        //Se instancia objeto de la clase Scanner con nombre leer
        Scanner leer = new Scanner(System.in);
        //Se solicitan datos
        System.out.println("ingrese cantidad de faltas: ");
        //se leen los datos
        cantFaltas = leer.nextInt();
        //se realiza las operaciones corresopondientes para lo requerido
        porcAsistencia = MAXIMO_ASISTENCIAS - cantFaltas;
        porcAsistencia = (porcAsistencia * 100) / MAXIMO_ASISTENCIAS;
        //Se imprime el resultado esperado/solicitado
        System.out.println("Porcentaje de asistencias: " + porcAsistencia);
    }
} 