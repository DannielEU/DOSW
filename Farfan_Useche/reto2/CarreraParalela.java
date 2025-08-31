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
    public String[][] informacionDeLista(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        String[][] informacion = new String[7][2];
        //mayor
        int mayor1 = mayorNumero(lista1);
        int mayor2 = mayorNumero(lista2);
        informacion[0][0] = ""+(mayor1);
        informacion[1][0] = ""+(mayor2);
        //menor
        informacion[0][1] = ""+(menorNumero(lista1)[0]);
        informacion[1][1] = ""+(menorNumero(lista2)[0]);
        //cantidad
        informacion[0][2] = ""+(menorNumero(lista1)[1]);
        informacion[1][2] = ""+(menorNumero(lista2)[1]);
        //multiplo
        informacion[0][3] = ""+(multiplode2(mayor1));
        informacion[1][3] = ""+(multiplode2(mayor2));
        //divisor
        informacion[0][4] = ""+(divisorDeDos(mayor1));
        informacion[1][4] = ""+(divisorDeDos(mayor2));
        //par
        informacion[0][5] = ""+(listaPar(lista1));
        informacion[1][5] = ""+(listaPar(lista2));
        //impar
        informacion[0][6] = ""+(cantidadInpar(lista1));
        informacion[1][6] = ""+(cantidadInpar(lista2));

        
        return informacion;
    }

    public boolean cantidadImpar(ArrayList<Integer> lista){
        return (lista.size() % 2 != 0)?true:false;
    }
}