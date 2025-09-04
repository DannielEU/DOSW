package Farfan_Useche.reto6;

public class SusurrarComando implements Comando {
    @Override
    public void ejecutar() {
        System.out.println("La máquina susurra: Shhh... los bugs están dormidos.");
    }
}
