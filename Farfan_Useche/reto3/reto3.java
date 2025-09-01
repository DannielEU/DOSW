package Farfan_Useche.reto3;

public class reto3{

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

}