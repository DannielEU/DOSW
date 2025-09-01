package Farfan_Useche.reto4;


import java.util.HashMap;

public class Reto4{
    private HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Hola");
    }
    
    public void reto4(String[][] args){
        for (String[] s : args) {
            this.map.put(s[0], Integer.parseInt(s[1]));
        }
    }
}