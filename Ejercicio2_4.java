import java.util.Scanner;

class Ejercicio2_4{
    static Scanner entrada = new Scanner(System.in);

    static int[] pedrinu(int arr[]){
        
        for(int i = 0; i<8; i++){
        System.out.println("ingrese un numero");
        arr[i] = entrada.nextInt();
        } 
        return arr;  
    }
    
    static void nump(int arr[]){
        for(int i = 0; i<8; i++){
            if(arr[i]%2 != 0){
                int salida;
                salida = arr[i];
                System.out.println("los numeros impares son: "+salida);
            }
        }
    }

    public static void main(String[] arg){
        int[] arr = new int[8];
        pedrinu(arr);
        nump(arr);


    }


}
