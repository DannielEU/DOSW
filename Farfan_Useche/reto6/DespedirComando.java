package Farfan_Useche.reto6;

public class DespedirComando implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
    }
}
