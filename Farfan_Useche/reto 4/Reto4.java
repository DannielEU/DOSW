package Farfan_Useche.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    private HashMap<String, Integer> map = new HashMap<>();
    private Hashtable<String, Integer> tabla = new Hashtable<>();
    private Map<String, Integer> combinado = new HashMap<>();

    public static void main(String[] args) {
        String[][] ejemplo1 = { {"a","1"}, {"c","3"}, {"b","999"} };
        String[][] ejemplo2 = { {"b","234"}, {"d","4"} ,{"z","34"}};
        System.out.println(Arrays.deepToString(ejemplo1));
        System.out.println(Arrays.deepToString(ejemplo2));
        Reto4 r = new Reto4();

        r.reto4(ejemplo1);
        r.almacernarHashtable(ejemplo2);

        r.combinado = r.combinador();
        System.out.println(r.combinado);
    }

    public void almacernarHashtable(String[][] claveValor){
        for (String[] info : claveValor) {
            if (!tabla.containsKey(info[0])) {
                tabla.put(info[0], Integer.parseInt(info[1]));
            }
        }
    }
    public void reto4(String[][] args){
        for (String[] s : args) {
            if (!this.map.containsKey(s[0])) {
                this.map.put(s[0], Integer.parseInt(s[1]));
            }
        }
    }
    public Map<String, Integer> combinador() {
        for (String clave : map.keySet()) {
            combinado.put(clave.toUpperCase(), map.get(clave));
        }
        for (String clave : tabla.keySet()) {
            combinado.remove(clave);
            combinado.put(clave.toUpperCase(), tabla.get(clave));

        }
        return combinado.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        }
}