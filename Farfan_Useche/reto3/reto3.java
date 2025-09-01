package Farfan_Useche.reto3;

import java.util.stream.Collectors;

public class Reto3{

    public static void main(String[] args) {
        System.out.println("Hola");
    }

    public static String repetirMensaje(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 3; i++) {
        sb.append(str);
        if (i < 2) {
            sb.append(" ");
        }
    }
    return sb.toString();
    }

    public static String buffer(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public String funcionesCombinadas(String str){
        return repetirMensaje(buffer(str));
    }
}