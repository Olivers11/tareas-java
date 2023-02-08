import java.util.Scanner;

class funciones {
    static Scanner entrada = new Scanner(System.in);

    static void vec(int y, int[]numeros) {
        
        boolean encontrado = false;
        for (int i : numeros) {
            if(y == i){
                
                encontrado = true;
            }

            
        }
        if(encontrado == true){
            System.out.println("Verdadero");
               
        }else{
            System.out.println("Falso");
        } 
    }

    static int pedirnum() {
        System.out.println("Ingrese un numero a buscar: ");
        int n = entrada.nextInt();
        return n;
    }

    public static void main(String[] args){ 
        int[] numeros = { 3, 2, 1, 3, 9, 5, 7, 8, };
        int n = pedirnum();
        vec(n,numeros);
    }
}
