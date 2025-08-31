package Farfan_Useche.reto1;

import java.util.*;

public class CarrelaParalela {
    public static void main(String[] args) {
        System.out.println("Hola");
    }
    public int MayorNumero( ArrayList lista){
        int numero = lista.stream().max((a,b) -> a.compareTo(b)).get());
        return numero;
    }
}
