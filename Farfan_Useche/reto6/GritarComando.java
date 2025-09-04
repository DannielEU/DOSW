package Farfan_Useche.reto6;

public class GritarComando implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
    }
}
