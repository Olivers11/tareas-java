import java.util.Scanner;

class ejercicio1{
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Numero A: ");
        int N = entrada.nextInt();
        System.out.print("Numero B: ");
        int A = entrada.nextInt();

        int suma_div = 0;
        for(int i = 1; i < N; i++){
            if(N % i == 0){
                suma_div += i;
            }
        }

        int suma_div2 = 0;
        for(int i = 1; i < A; i++){
            if(A % i == 0){
                suma_div2 += i;
            }
        }

        if(suma_div == A && suma_div2 == N){
            System.out.println("Son numeros amigos");
        }
        else{
            System.out.println("No son numeros amigos");
        }

    }

}