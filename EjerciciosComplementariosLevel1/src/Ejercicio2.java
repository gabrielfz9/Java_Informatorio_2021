import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros enteros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Los numeros ingresados son: " + a + ", " + b);

        System.out.println(a + " + " + b + " = "+ (a+b));
        System.out.println(a + " - " + b + " = "+ (a-b));
        System.out.println(a + " * " + b + " = "+ (a*b));
        System.out.println(a + " / " + b + " = "+ (a/b));
        System.out.println(a + " % " + b + " = "+ (a%b));

    }
}
