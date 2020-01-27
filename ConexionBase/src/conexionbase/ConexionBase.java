package conexionbase;

import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PreparedStatement ps = null;
        conexion stringConexion = new conexion();
        stringConexion.getConexion();
        
        // Insert
        
        String insert =
"insert into "
+ "articulos(nombre,descripcion,precio) "
+ "values(?,?,?) ";
        
        try {
            ps = stringConexion
                    .getConxion()
                    .prepareStatement(insert);
            ps.setString(1, "X box");
            ps.setString(2, "Consola juegos");
            ps.setInt(3, 500);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
}   
