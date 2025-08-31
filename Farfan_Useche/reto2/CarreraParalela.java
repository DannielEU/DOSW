package Farfan_Useche.reto2;

import java.util.*;

public class CarreraParalela {
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

    public int[] mayorMenorCantida(ArrayList<Integer> lista){
        int[] resultado = new int[3];
        int mayor = mayorNumero(lista);
        int[] menorCantidad = menorNumero(lista);
        resultado[0] = mayor;
        resultado[1] = menorCantidad[0];
        resultado[2] = menorCantidad[1];
        return resultado;
    }
}