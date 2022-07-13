package Solid.SRP;

public class Empleado {
    private final String firstName, lastName;
    private String empId;
    private final double experienceInYears;
    public Empleado(String firstName, String lastName, double experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experience;
    }


    public void displayEmpDetail(){
        System.out.println("Nombre del empleado: "+lastName+","+firstName);
        System.out.println("Este empleado tiene "+ experienceInYears+" años de experiencia.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

}
