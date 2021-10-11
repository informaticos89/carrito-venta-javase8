package pe.escueladigital.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.escueladigital.dao.PSQLProducto;
import pe.escueladigital.modelos.Producto;
import pe.escueladigital.utilidades.Utilidades;

@WebServlet(name = "ServletProductoDetalle", urlPatterns = {"/producto-detalle"})
public class ServletProductoDetalle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sId = request.getParameter("id");
        short id;
        try {
            id = Short.parseShort(sId);
        } catch (NumberFormatException nfe) {
            id = 0;
        }
        
        PSQLProducto dao = new PSQLProducto();
        Producto producto = dao.obtenerPorId(id);
        
        request.setAttribute("producto", producto);
        Utilidades.getInstancia().irAPagina(request, response, getServletContext(), "/producto-detalle.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
