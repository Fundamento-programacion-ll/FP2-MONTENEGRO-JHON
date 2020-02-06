package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class provincia {
    private String nombreProvincia;
    private double numeroHabitantes;

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public double getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(double numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public provincia(String nombreProvincia, double numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public provincia() {
           String datos;

        datos = JOptionPane.showInputDialog(null, "Ingrese los datos separados por punto y coma");
        StringTokenizer  tokens = new StringTokenizer(datos,";");
        this.nombreProvincia = tokens.nextToken();
        this.numeroHabitantes = Integer.parseInt(tokens.nextToken());  
    }
    
}
