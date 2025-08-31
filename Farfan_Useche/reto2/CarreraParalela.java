package Farfan_Useche.reto2;

import java.util.*;

public class CarrelaParalela {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }

    public int mayorNumero( ArrayList<Integer> lista){
        int numero = lista.stream().max((a,b) -> a.compareTo(b)).get();
        return numero;
    }

    public int[] menorNumero(ArrayList<Integer> lista){
        int[] resultado = new int[2];
        int numero = lista.stream().min((a,b) -> a.compareTo(b)).get();
        resultado[0] = lista.size();
        resultado[1] = numero;
        return resultado;
    }
}