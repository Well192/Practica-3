package Solid.OCP;

public class ArteEstudiante extends Estudiante{
    public ArteEstudiante(String name, String regNumber, double score, String departmant) {
        super(name, regNumber, score);
        this.department = departmant;
    }

    @Override
    public String toString() {
        return super.toString();
    }



}

