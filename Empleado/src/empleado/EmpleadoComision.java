package empleado;

public class EmpleadoComision extends Empleado{
    private double ventasbrutas, tarifacomision;

    
    public EmpleadoComision() {
    }

    public double getVentasbrutas() {
        return ventasbrutas;
    }

    public void setVentasbrutas(double ventasbrutas) {
        this.ventasbrutas = ventasbrutas;
    }

    public double getTarifacomision() {
        return tarifacomision;
    }

    public void setTarifacomision(double tarifacomision) {
        this.tarifacomision = tarifacomision;
    }

    public EmpleadoComision(double ventasbrutas, double tarifacomision) {
        this.ventasbrutas = ventasbrutas;
        this.tarifacomision = tarifacomision;
    }

    public EmpleadoComision(double ventasbrutas, double tarifacomision, String nombre, String apellido, float cedula) {
        super(nombre, apellido, cedula);
        this.ventasbrutas = ventasbrutas;
        this.tarifacomision = tarifacomision;
    }
    
}
