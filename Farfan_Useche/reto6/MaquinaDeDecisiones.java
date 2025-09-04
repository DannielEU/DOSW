package Farfan_Useche.reto6;

import java.util.HashMap;
import java.util.Map;
public class MaquinaDeDecisiones {
    private final Map<String, Comando> comandos = new HashMap<>();

    public MaquinaDeDecisiones() {
        comandos.put("SALUDAR", new SaludarComando());
        comandos.put("DESPEDIR", new DespedirComando());
        comandos.put("CANTAR", new CantarComando());
        comandos.put("DANZAR", new DanzarComando());
    }

    public void ejecutarComando(String comando) {
        // Switch opcional (como pide el reto)
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                comandos.get(comando).ejecutar();
                break;
            default:
                System.out.println("La máquina no entiende ese comando.");
        }
    }
}