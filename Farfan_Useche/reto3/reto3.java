package Farfan_Useche.reto3;

import java.util.*;

public class reto3 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
    public buffer(String texto){
        texto.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
        ).reverse().toString();
    }
}