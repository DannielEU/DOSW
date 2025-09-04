package Farfan_Useche.reto6;

public class SaludarComando implements Comando{
    @Override
    public void ejecutar() {
        System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
    }
}
