import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] ciudades = new String[4];
        ciudades[0] = "Nada";
        System.out.println("Ingrese ciudad fav #1");
        ciudades[1] = in.nextLine();
        System.out.println("Ingrese ciudad fav #2");
        ciudades[2] = in.nextLine();
        System.out.println("Ingrese ciudad fav #3");
        ciudades[3] = in.nextLine();
        in.close();

        for (int i = 1; i <= 4; i++) {
            System.out.println("#" + i + " - " + ciudades[i]);
        }
    }
}