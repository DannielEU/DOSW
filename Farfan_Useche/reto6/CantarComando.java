package Farfan_Useche.reto6;

public class CantarComando implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("La máquina canta: 01010101");
    }
}
