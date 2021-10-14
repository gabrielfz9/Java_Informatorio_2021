import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){
        System.out.println("Ingrese 2 numeros: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int resultado = 1;
        in.close();

        for (int i=0; i < b; i++) {
            resultado = resultado * a;
        }
        System.out.print(a + " elevado a " + b + " = " + resultado);
    }
}
