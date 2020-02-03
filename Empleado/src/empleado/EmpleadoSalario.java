package empleado;

public class EmpleadoSalario extends Empleado{
    private double salariomensual;

    public EmpleadoSalario() {
    }

    public EmpleadoSalario(double salariomensual) {
        this.salariomensual = salariomensual;
    }

    public EmpleadoSalario(double salariomensual, String nombre, String apellido, float cedula) {
        super(nombre, apellido, cedula);
        this.salariomensual = salariomensual;
    }

    public double getSalariomensual() {
        return salariomensual;
    }

    public void setSalariomensual(double salariomensual) {
        this.salariomensual = salariomensual;
    }
}
