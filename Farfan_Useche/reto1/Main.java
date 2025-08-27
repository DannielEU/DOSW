package Farfan_Useche.reto1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Daniel Useche", 21, "Daniel.Useche-p.escuelaing.edu.co", 6),
            new Estudiante("JaredFarfan", 19, "Jared.Farfan-g@mail.escuelaing.edu.co", 5)
        );

        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}
