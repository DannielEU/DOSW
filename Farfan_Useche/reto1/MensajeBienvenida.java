package Farfan_Useche.reto1;

import java.util.*;
import java.util.stream.Collectors;

class MensajeBienvenida {
    public static String generarMensaje(List<Estudiante> estudiantes) {
        String estudiantesTexto = estudiantes.stream()
            .map(e -> e.getNombre() + " estudiante de la escuela \nde "
                       + e.getSemestre() + " semestre de " 
                       + e.getEdad() + " años")
            .collect(Collectors.joining(" y "));

        String correosTexto = estudiantes.stream()
            .map(Estudiante::getCorreo)
            .collect(Collectors.joining(" y "));

        return "¡Hola Bienvenidos! \nNosotros somos la pareja conformada por "
                + estudiantesTexto 
                + ", nuestros correos institucionales son \n"
                + correosTexto;
    }
}