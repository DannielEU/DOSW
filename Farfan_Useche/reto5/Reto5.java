package Farfan_Useche.reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Reto5 {

    private HashSet<Integer> hash;
    public static void main(String[] args) {
       System.out.println("Hello World");
    }

    public static Set<Integer> equipoHashSet(Integer[] numeros) {
        HashSet<Integer> equipo = new HashSet<>();
        for (int i : numeros) {
            equipo.add(i);
        }
        Set<Integer> filtrado = equipo.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
        return filtrado;
    }

}