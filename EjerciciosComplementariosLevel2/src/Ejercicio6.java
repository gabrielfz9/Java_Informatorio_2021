import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Ejercicio6 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> dni = new LinkedHashSet<>();
        Set<String> nombres = new HashSet<>();
        LinkedHashSet<Integer> horasTrabajadas = new LinkedHashSet<>();
        LinkedHashSet<Integer> valorPorHora = new LinkedHashSet<>();
        Map<Integer, Integer> cobranza = new HashMap<>();
        dni.add(2131231312);
        dni.add(987654321);   
        nombres.add("Fowler Newton");
        nombres.add("Elton Mayo");
        horasTrabajadas.add(4);
        horasTrabajadas.add(8);      
        valorPorHora.add(350);
        valorPorHora.add(345);
        ArrayList<Integer> documentos = new ArrayList<>(dni);
        ArrayList<Integer> horasDeTrabajo = new ArrayList<>(horasTrabajadas);
        ArrayList<Integer> pesosPorHora = new ArrayList<>(valorPorHora);
        for (Integer i=0; i<=1; i++) {
            cobranza.put(documentos.get(i), horasDeTrabajo.get(i) * pesosPorHora.get(i));
        }
        
        for (Map.Entry<Integer, Integer> registro: cobranza.entrySet()) {
            System.out.println("DNI: " + registro.getKey() + " Sueldo: " + registro.getValue());
        }
    }
}