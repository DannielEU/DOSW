package Farfan_Useche.reto5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    private HashSet<Integer> hash;
    public static void main(String[] args) {
        Integer[] ejemplo1 = {4, 9, 15, 7, 18, 21, 10, 5};
        Integer[] ejemplo2 = {12, 3, 25, 10, 7, 30, 18, 4};
        System.out.println(Arrays.toString(ejemplo1));
        System.out.println(Arrays.toString(ejemplo2));

        // Creamos una instancia
        Farfan_Useche.reto5.Reto5 r = new Farfan_Useche.reto5.Reto5();
        Set<Integer> multiploDe3 = r.equipoHashSet(ejemplo1);
        Set<Integer> multiploDe5 = r.procesarNumeros(ejemplo2);
        r.batallaFinal(multiploDe5, multiploDe3);
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

    public TreeSet<Integer> procesarNumeros(Integer[] numerosEntrada) {
        TreeSet<Integer> numeros = new TreeSet<>();
        for (int num : numerosEntrada) {
            numeros.add(num);
        }
        numeros.removeIf(n -> n % 5 == 0);
        return numeros;
    }

    public static Set<Integer> batallaFinal(Set<Integer> equipoA, Set<Integer> equipoB) {
        TreeSet<Integer> union = new TreeSet<>(equipoA);
        union.addAll(equipoB);
        union.forEach(n -> System.out.println("Número en arena: " + n));
        return union;
    }
}