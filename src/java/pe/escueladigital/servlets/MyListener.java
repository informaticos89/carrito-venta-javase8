package pe.escueladigital.servlets;

import java.util.Properties;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import pe.escueladigital.utilidades.Utilidades;

@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String servidor = sce.getServletContext().getInitParameter("servidor");
        String puerto = sce.getServletContext().getInitParameter("puerto");
        String basededatos = sce.getServletContext().getInitParameter("basededatos");
        String usuariobd = sce.getServletContext().getInitParameter("usuario");
        String passwordbd = sce.getServletContext().getInitParameter("password");
        
        Properties propiedadesConexion = new Properties();
        propiedadesConexion.setProperty("servidor", servidor);
        propiedadesConexion.setProperty("puerto", puerto);
        propiedadesConexion.setProperty("basededatos", basededatos);
        propiedadesConexion.setProperty("usuariobd", usuariobd);
        propiedadesConexion.setProperty("passwordbd", passwordbd);
        
        Utilidades.getInstancia().configuraBaseDeDatos(propiedadesConexion);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    
}
