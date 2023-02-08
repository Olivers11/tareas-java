import java.util.Scanner;

class Ejercicio4{
    static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
   
    double total = 0;
    for(int i = 0; i<=63; i++){
       double resul = Math.pow(2, i);
       int a = i+1;
        total += resul; 
        System.out.println("Casilla "+a+ " Granos "+resul);
        
    }
    System.out.println("-----------------------------------------------------------------");
    System.out.println("La suma de todos los granos es: "+ total);

   }
}
