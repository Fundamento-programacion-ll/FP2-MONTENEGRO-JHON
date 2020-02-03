package empleado;

public class Empleado {
    
        private String nombre, apellido;
        private float cedula;
        
    public void calcularIngresos(){
        
    }

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, float cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getCedula() {
        return cedula;
    }

    public void setCedula(float cedula) {
        this.cedula = cedula;
    }
    }
