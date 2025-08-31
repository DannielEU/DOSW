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
        boolean divisorDeDos = divisorDeDos(mayor);
        int[] menorCantidad = menorNumero(lista);
        resultado[0] = mayor;
        this.multiplode2(mayor);
        resultado[1] = menorCantidad[0];
        resultado[2] = menorCantidad[1];
        return resultado;
    }

    public boolean divisorDeDos(int numero) {
        return (2 % numero == 0) ? true : false;
    }

    private boolean multiplode2(int numero) {
        boolean resultado = (numero % 2 == 0) ? true : false;
        return resultado;
    }
    private boolean listaPar( ArrayList<Integer> lista){
        return (lista.size() % 2 == 0) ? true : false;
    }
    public List<String> informacionDeLista(ArrayList<Integer> lista) {
        List<String> info = new ArrayList<>();

        int mayor = mayorNumero(lista);
        int menor = menorNumero(lista);
        info.add("Lista: " + lista);
        info.add("Menor: " + menor);
        info.add("Mayor: " + mayor);
        info.add("¿El mayor es múltiplo de 2? " + multiplode2(mayor));
        info.add("¿El mayor es divisor de 2? " + divisorDeDos(mayor));

        return info;
    }
}