import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
        System.out.println("Ingrese 2 numeros: ");
        Scanner in = new Scanner(System.in);
        int suma = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        for (int i=0; i < b; i++) {
            suma = suma + a;
        }
        System.out.print(a + " + " + b + " = " + suma);
    }
}