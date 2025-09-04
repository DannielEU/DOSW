package Farfan_Useche.reto6;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto6 {

    public static void main(String[] args) {
        MaquinaDeDecisiones maquina = new MaquinaDeDecisiones();

        maquina.ejecutarComando("SALUDAR");
        maquina.ejecutarComando("BROMEAR");
        maquina.ejecutarComando("ANALIZAR");
        maquina.ejecutarComando("DANZAR");
        maquina.ejecutarComando("GRITAR");
        maquina.ejecutarComando("SUSURRAR");
        maquina.ejecutarComando("DESPEDIR");
        maquina.ejecutarComando("CANTAR");
        maquina.ejecutarComando("OTRO");
    }
}