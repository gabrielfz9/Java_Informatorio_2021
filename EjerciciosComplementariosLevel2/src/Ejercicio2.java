import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresar número : ");
            int num = sc.nextInt();
            agregarNumero(-1,listaNumeros, num);
        }

        System.out.println("Tamaño  antes de agregar al principio : " + listaNumeros.size());
        System.out.println("Ingresar un número para agregar al principio : ");
        int numAgregar = sc.nextInt();
        agregarNumero(0, listaNumeros, numAgregar);
        System.out.println("Tamaño  después de agregar al principio : " + listaNumeros.size());
        System.out.println("Tamaño antes de agregar al final : " + listaNumeros.size());
        System.out.println("Ingresar un número para agregar al final : ");
         numAgregar = sc.nextInt();
        agregarNumero(-1,listaNumeros, numAgregar);
        System.out.println("Tamaño  después de agregar al final : " + listaNumeros.size());
        imprimirLista(listaNumeros);
        sc.close();
    }

    public static ArrayList<Integer> agregarNumero(int index ,ArrayList<Integer> listaNumeros, int num ) {       
        if (index!= -1) {
            listaNumeros.add(index,num);
        }else{
            listaNumeros.add(num);
        }
        return listaNumeros;
    }

    public static void imprimirLista(ArrayList<Integer>listaNumeros) {
        for (Integer i : listaNumeros) {            
            System.out.print(i+ " - ");
        }  
    }
}