package pe.escueladigital.utilidades;

import java.io.IOException;
import java.util.Properties;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public final class Utilidades {

    private static final Utilidades instancia = new Utilidades();
    private Properties propiedadesBD;
    
    private Utilidades(){}
    
    public static Utilidades getInstancia(){
        return instancia;
    }
    
    public void configuraBaseDeDatos(Properties propiedades) {
        this.propiedadesBD = propiedades;
    }
    
    public Properties getConfiguracionBaseDeDatos() {
        return this.propiedadesBD;
    }
    
    public void irAPagina(HttpServletRequest request, HttpServletResponse response, ServletContext contexto, String url)
            throws ServletException, IOException {
        RequestDispatcher despachador = contexto.getRequestDispatcher(url);
        despachador.forward(request, response);
    }
    
}
