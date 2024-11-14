/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empresa;
import Modelo.GestionarEmpresa;
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
 * @author rusag
 */
@WebServlet(name = "ControladorEmpresa", urlPatterns = {"/ControladorEmpresa"})
public class ControladorEmpresa extends HttpServlet {

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
         String usuario;
         usuario=request.getParameter("usuario");
         
          String contrasena;
         contrasena=request.getParameter("contrasena");
         
          String razonsocial;
         razonsocial=request.getParameter("razonsocial");
         
          String telefono;
         telefono=request.getParameter("telefono");
        
          String email;
         email=request.getParameter("email");
         
          String direccion;
         direccion=request.getParameter("direccion");
         
          String localidad;
         localidad=request.getParameter("localidad");
         
          String provincia;
         provincia=request.getParameter("provincia");
        
         Empresa empresa = new Empresa();
         empresa.setUsuario(usuario);
         empresa.setContraseña(contrasena);
         empresa.setRazonSocial(razonsocial);
         empresa.setTelefono(0);
         empresa.setEmail(email);
         empresa.setDireccion(direccion);
         empresa.setLocalidad(localidad);
         empresa.setProvincia(provincia);
         empresa.setRubro("");
         empresa.setCalificacion(0);
         empresa.setCertificacion("");
         empresa.setLogo("");
         GestionarEmpresa ge= new GestionarEmpresa();
         boolean v = ge.insertarEmpresa(empresa);
         request.setAttribute("empresa", empresa);
         request.setAttribute("v",v);
        try (PrintWriter out = response.getWriter()) {
             RequestDispatcher enviar;
            enviar=request.getRequestDispatcher("Resultado.jsp");
            enviar.forward(request,response);
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
            Logger.getLogger(ControladorEmpresa.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ControladorEmpresa.class.getName()).log(Level.SEVERE, null, ex);
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
