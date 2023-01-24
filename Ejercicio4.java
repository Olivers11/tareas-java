import java.util.Scanner;

class Ejercicio4{
    static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
    int suma =0;
    int suma2 = 1;
    System.out.print("Ingrese un numero: ");
    int n = entrada.nextInt();
    System.out.print("Ingrese otro numero: ");
    int b = entrada.nextInt();
    
    for(int i = n; i<=b; i++){
        if(i%2 == 0){
            suma +=i;
           
       }else{
        suma2 *= i;
       }
        
            
    }
    /*for(int i = n; i<=b; i++){
        if(i%2 != 0){
            suma2*=i;
        }
    }*/
    System.out.println(suma);
    System.out.println(suma2);
}

}