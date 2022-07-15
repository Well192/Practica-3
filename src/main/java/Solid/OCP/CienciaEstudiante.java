package Solid.OCP;

public class CienciaEstudiante extends Estudiante{
    public CienciaEstudiante(String name, String regNumber, double score,String departament) {
        super(name, regNumber, score);
        this.department = departament;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

