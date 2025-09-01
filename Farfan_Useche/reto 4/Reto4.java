package Farfan_Useche.reto4;

import java.util.Hashtable;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Reto4{
    private HashMap<String, Integer> map = new HashMap<>();
    private Hashtable<String, Integer> tabla = new Hashtable<>();
    private HashMap<String, Integer> combinado = new HashMap<>();

    public static void main(HashMap<String, Integer> map, Hashtable<String, Integer> tabla) {
        this.map = map;
        this.tabla =tabla;
    }

    public void almacernarHashtable(String[][] claveValor){
        for (String[] info : claveValor) {
            if (!tabla.containsKey(info[0])) {
                tabla.put(info[0], Integer.parseInt(info[1]));
            }
        }
    }

    public void combinado() {
        for (String clave : map.keySet()) {
            combinado.put(clave, map.get(clave));
        }
        for (String clave : tabla.keySet()) {
            combinado.put(clave, tabla.get(clave));
        }
    }

    public HashMap<String, Integer> clavesMayusculas(HashMap<String, Integer> original) {
        HashMap<String, Integer> nuevo = new HashMap<>();
        for (String clave : original.keySet()) {
            nuevo.put(clave.toUpperCase(), original.get(clave));
        }
        return nuevo;
    }

    public Map<String, Integer> ordenarClaves(HashMap<String, Integer> original){
        Map<String, Integer> mapaOrdenado = original.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey()) // compara por clave
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
        return mapaOrdenado;
    }

}