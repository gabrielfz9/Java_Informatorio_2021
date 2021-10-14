import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int limiteNum = sc.nextInt();
        sc.close();

        for (int i=1; i<=limiteNum; i++) {
            System.out.println("");
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
        }
        System.out.print("\n");
    }
}
