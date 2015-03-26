import static java. lang. System. out;
import java. util. Scanner;
import java. util. Random;
class Juego {
    public static void main(String args[ ] ) {
      
       Scanner ingreso= new Scanner(System.in);
       out. println("Hola, adivina el numero!!");
       out. println("Ingresa un numero del 1 al 10");
       int numeroIngreso = ingreso.nextInt();
       int aleatorio = new Random().nextInt(10)+1;
       
       while (numeroIngreso != aleatorio) 
       {
        out. println("Disculpa ese no es el numero!! Ingresa otro numero");
        numeroIngreso = ingreso.nextInt();
       }
        out. println("Acertaste! El numero es el: " + numeroIngreso);               
    }
}
