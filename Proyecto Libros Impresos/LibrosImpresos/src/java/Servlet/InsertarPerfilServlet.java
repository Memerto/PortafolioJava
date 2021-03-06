/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.InsertarPersona;
import Modelo.Persona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JoseMiguel
 */
public class InsertarPerfilServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            HttpSession session=request.getSession();
            Persona pe=new Persona();
            InsertarPersona ip=new InsertarPersona();
            session.setAttribute("pe",pe);

                String rut=request.getParameter("txtRut");
                String clave=request.getParameter("txtClave");
                String nombre=request.getParameter("txtNombre");
                String apellido=request.getParameter("txtApellido");
                String cargo=request.getParameter("cmbCargo");
               
                pe.setRut(rut);
                pe.setClave(clave);
                pe.setNombre(nombre);
                pe.setApellido(apellido);
                pe.setCargo(cargo);;

                ip.CrearPersona(pe);
                
                  request.getRequestDispatcher("PaginaHTML/Logueado/LogueadoA/IngresoExitoso.jsp").forward(request, response);
                request.setAttribute("msj", "Usuario Ingresado Correctamente");
            }
                catch(Exception ex){
                 request.setAttribute("msj", "El nuevo Usuario no se ha podido ingresar"); 
                   request.getRequestDispatcher("PaginaHTML/Logueado/LogueadoA/GenerarPerfilesUsuario.jsp").forward(request, response);
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
        processRequest(request, response);    }

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
