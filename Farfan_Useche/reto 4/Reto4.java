package Farfan_Useche.reto4;

import java.util.Hashtable;


import java.util.HashMap;

public class Reto4{
    private HashMap<String, Integer> map = new HashMap<>();
    private Hashtable<String, Integer> combinado = new Hashtable<>();

    public Hashtable<String, Integer> tabla = new Hashtable<>();

    public static void main(String[] args) {
        System.out.println("Hola");
    }

    public Hashtable<String, Integer> almacernarHashtable(String[][] claveValor){
        for (String[] info : claveValor) {
            if (!tabla.containsKey(info[0])) {
                tabla.put(info[0], Integer.parseInt(info[1]));
            }
        }
        return tabla;
    }
    
    public void reto4(String[][] args){
        for (String[] s : args) {
            this.map.put(s[0], Integer.parseInt(s[1]));
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

}