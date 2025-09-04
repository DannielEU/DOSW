package Farfan_Useche.reto6;

public class DanzarComando implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
    }
}