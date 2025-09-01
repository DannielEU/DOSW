package Farfan_Useche.reto4;

import java.util.Hashtable;



public class Reto4{

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

}