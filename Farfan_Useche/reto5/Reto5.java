package Farfan_Useche.reto5;

public class Reto5 {

    public static void main(String[] args) {
       System.out.println("Hello World");
    }

    public TreeSet<Integer> procesarNumeros(int[] numerosEntrada) {
        TreeSet<Integer> numeros = new TreeSet<>();

        for (int num : numerosEntrada) {
            numeros.add(num);
        }
        numeros.removeIf(n -> n % 5 == 0);

        return numeros;
    }
}