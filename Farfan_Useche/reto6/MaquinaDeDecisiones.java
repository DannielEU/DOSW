package Farfan_Useche.reto6;

import java.util.HashMap;
import java.util.Map;
public class MaquinaDeDecisiones {
    private final Map<String, Comando> comandos = new HashMap<>();

    public MaquinaDeDecisiones() {
    }
    public void ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando).ejecutar();
                break;
            default:
                System.out.println("La máquina no entiende ese comando.");
        }
    }
}