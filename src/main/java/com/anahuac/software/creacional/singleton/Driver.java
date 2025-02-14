package com.anahuac.software.creacional.singleton;

import java.util.HashMap;

public class Driver {

    public static void main(String[] args) {
        // Obtener la instancia única del Logger
        Logger logger = Logger.getInstance();

        HashMap<String, String> listaAsistencia = new HashMap<>();
        listaAsistencia.put("Juan Pérez", "presente");
        listaAsistencia.put("María García", "ausente");
        listaAsistencia.put("Carlos López", "justificado");
        listaAsistencia.put("Ana Martínez", "presente");
        listaAsistencia.put("Luis Hernández", "ausente");

        for (String alumno : listaAsistencia.keySet()) {
            String estado = listaAsistencia.get(alumno);

            switch (estado) {
                case "presente":
                    logger.info(alumno + " está presente.");
                    break;
                case "ausente":
                    logger.error(alumno + " está ausente.");
                    break;
                case "justificado":
                    logger.warning(alumno + " tiene una justificación.");
                    break;
                default:
                    logger.warning("Estado de asistencia no reconocido para " + alumno + ".");
            }
        }
    }
}
