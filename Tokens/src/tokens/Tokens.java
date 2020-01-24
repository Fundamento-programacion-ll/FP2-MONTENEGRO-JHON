package tokens;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dimension = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Dimension del Arreglo"));
        
        Vector v=new Vector(dimension);
        
        System.out.println(v);
        
    }
 
    
}
