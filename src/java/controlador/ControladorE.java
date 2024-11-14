/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorE;

import Modelo.GestionarEmpresa;
import Modelo.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
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
 * @author santi
 */
@WebServlet(name = "ControladorE", urlPatterns = {"/ControladorE"})
public class ControladorE extends HttpServlet {

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
        //En esta parte recibimos la información de la vista
         String palabraClave = request.getParameter("palabraClave");
        String criterio = request.getParameter("criterio");
       
        GestionarEmpresa e = new GestionarEmpresa();
        ArrayList<Empresa> lista = new ArrayList<>();  
        if("Razón social".equals(criterio)){
       
            lista = e.buscarEmpresaRazonSocial(palabraClave);
        }
         if("Localidad".equals(criterio)){
       
            lista = e.buscarEmpresaPorLocalidad(palabraClave);
        }
         if("Provincia".equals(criterio)){
       
            lista = e.buscarEmpresaPorProvincia(palabraClave);
        }
          if("Rubro".equals(criterio)){
       
            lista = e.buscarEmpresaPorRubro(palabraClave);
        }
           
        request.setAttribute("lista", lista);
        
        try (PrintWriter out = response.getWriter()) {
            //Enviamos la información a la vista
            RequestDispatcher a = null;
            a = request.getRequestDispatcher("resultadoE.jsp");
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
            Logger.getLogger(ControladorE.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ControladorE.class.getName()).log(Level.SEVERE, null, ex);
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
