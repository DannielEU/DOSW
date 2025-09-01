package Farfan_Useche.reto3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3{

    public static void main(String[] args) {
        System.out.println("Hola");

    }

    public static String repetirMensaje(String str) {
        StringBuilder sb = new StringBuilder();
        // Uso de stream para repetir 3 veces
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> str)
                .collect(Collectors.joining(" "));

        sb.append(repetido);
        return sb.toString();
    }

    public static String buffer(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public String funcionesCombinadas(String str){
        return repetirMensaje(buffer(str) + " ");
    }
}