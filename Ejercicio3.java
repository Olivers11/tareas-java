import java.util.Scanner;

class Ejercicio3{
    static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
    int suma =0;
    System.out.print("Ingrese un numero: ");
    int n = entrada.nextInt();
    System.out.print("Ingrese otro numero: ");
    int b = entrada.nextInt();

    for(int i=n+1; i<b; i++){
        suma += i;
    }
    System.out.println(suma);

}

}