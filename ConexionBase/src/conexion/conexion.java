package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    
    Connection conexion = null;
    String url = 
"jdbc:mysql://localhost:32777/prueba?useSSL=false";
    String usuario = "admin";
    String password = "12345678";
    
    
    public conexion(){
        
        try {
            conexion = (Connection) DriverManager.getConnection(url,usuario,password);
            if (conexion != null) {
                System.out.println("Se conecto");
            } else {
                System.err.println("No Se conecto");
            }
        } catch (SQLException ex) {
            System.err.println("Error conexion");
            ex.printStackTrace();
        }
    }
    
    
    public  Connection getConxion(){
        return conexion;
    }
    
    public  void Desconectars(){
        conexion = null;
    }

    public void getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
