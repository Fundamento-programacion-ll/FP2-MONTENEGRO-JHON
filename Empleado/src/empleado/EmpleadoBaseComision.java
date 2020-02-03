package empleado;

public class EmpleadoBaseComision extends EmpleadoComision{
    private double salariobase;

    public EmpleadoBaseComision() {
    }

    public EmpleadoBaseComision(double salariobase) {
        this.salariobase = salariobase;
    }

    public EmpleadoBaseComision(double salariobase, double ventasbrutas, double tarifacomision) {
        super(ventasbrutas, tarifacomision);
        this.salariobase = salariobase;
    }

    public EmpleadoBaseComision(double salariobase, double ventasbrutas, double tarifacomision, String nombre, String apellido, float cedula) {
        super(ventasbrutas, tarifacomision, nombre, apellido, cedula);
        this.salariobase = salariobase;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }
    
 
}
