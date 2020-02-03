package empleado;

public class EmpleadoHoras extends Empleado{
    
    private double sueldo, horas;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public EmpleadoHoras(double sueldo, double horas, String nombre, String apellido, float cedula) {
        super(nombre, apellido, cedula);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
}
