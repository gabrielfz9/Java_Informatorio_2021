import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Número:");
        int n = scan.nextInt();
        System.out.println("Ingrese Final del Bucle: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) { 
                System.out.print("FizzBuzz");
            } else if (i % 2 == 0) { 
                System.out.print("Fizz");
            } else if (i % 3 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        scan.close();
    }
}
