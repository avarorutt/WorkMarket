/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.GestionPublicacionp;
import Modelo.PublicacionProfesional;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author us
 */
@WebServlet(name = "ControladorPublicacionProfesional", urlPatterns = {"/ControladorPublicacionProfesional"})
public class ControladorPublicacionProfesional extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        /*En esta parte recibimos la informacion del formulario*/
        String rubro;
        rubro = request.getParameter("rubro");
        
        
        String titulo;
        titulo = request.getParameter("titulo");
     
        
        String descripcion;
        descripcion = request.getParameter("descripcion");
        
        
        int idprof;
        idprof = Integer.parseInt(request.getParameter("idprof"));
 
       
        PublicacionProfesional pp = new PublicacionProfesional();
        pp.setRubro(rubro);
        pp.setTitulo(titulo);
        pp.setDescripcion(descripcion);
        pp.setIdProf(idprof);
        
        GestionPublicacionp gp = new GestionPublicacionp();

        request.setAttribute("b", gp.insertarPublicacion(pp));
       
        
        request.setAttribute("pp", pp);
        
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher a = null;
            a = request.getRequestDispatcher("resultado.jsp");
            a.forward(request, response);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPublicacionProfesional.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPublicacionProfesional.class.getName()).log(Level.SEVERE, null, ex);
        }
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
