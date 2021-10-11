package pe.escueladigital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import pe.escueladigital.utilidades.Utilidades;

public class PSQLConexion {

    Connection conectar() {
        Connection conexion = null;
        Properties propiedades = Utilidades.getInstancia().getConfiguracionBaseDeDatos();
        String url = "jdbc:postgresql://" +
                        propiedades.getProperty("servidor") +
                        ":" + propiedades.getProperty("puerto") +
                        "/" + propiedades.getProperty("basededatos");
        String user = propiedades.getProperty("usuariobd");
        String pass = propiedades.getProperty("passwordbd");
        
        try {
            conexion = DriverManager.getConnection(url, user, pass);
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return conexion;
    }
    
}
