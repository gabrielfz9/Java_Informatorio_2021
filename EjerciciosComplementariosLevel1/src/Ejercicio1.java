import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = sc.nextLine();
        sc.close();
        System.out.println("HOLA " + nombreUsuario);
    }
}
