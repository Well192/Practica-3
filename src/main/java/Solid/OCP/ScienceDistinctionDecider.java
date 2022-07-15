package Solid.OCP;

import Solid.OCP.Estudiante;

import java.util.Arrays;
import java.util.List;

public class ScienceDistinctionDecider implements DistinctionDecider {
    List<String> science= Arrays.asList("Ciencia de la Computacion.","Fisica");
    public void evaluateDistinction(Estudiante estudiante) {
        if (science.contains(estudiante.department)) {
            if (estudiante.score > 80) {
                System.out.println(estudiante.regNumber+" ha recibido una distincion en ciencias.");
            }
        }
    }
}