import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        System.out.println("Ingrese un numero por teclado: ");
        Scanner in = new Scanner(System.in);
        int iFactorial = 1;
        int iNumero = in.nextInt();
        in.close();

        for (int x=2; x <= iNumero; x++){
            iFactorial = iFactorial * x;
        }
        System.out.println("El factorial del numero " + iNumero + " es: " + iFactorial);
    }
}
