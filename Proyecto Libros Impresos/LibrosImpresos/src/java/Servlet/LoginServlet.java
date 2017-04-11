/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.NegocioPersona;
import Modelo.Persona;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JoseMiguel
 */
public class LoginServlet extends HttpServlet {

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
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        NegocioPersona np = new NegocioPersona();
        Persona p = null;
        
            if (!user.equalsIgnoreCase("") && !pass.equalsIgnoreCase("")) {
                try {

                    Controlador.NegocioPersona ub = new Controlador.NegocioPersona();

                    Modelo.Persona u  = null;
                    u =  ub.ValidarPersona(user, pass);
                    if (u != null) {
                        HttpSession session = request.getSession(); 

                        request.getSession().setAttribute("per", u); 
                        
                      switch (u.getCargo()) {
                            case "Administrador":
                            request.getRequestDispatcher("PaginaHTML/Logueado/LogueadoA/InicioAdministrador.jsp").forward(request, response);    
                                break;
                            case "Cajero":
                            request.getRequestDispatcher("PaginaHTML/Logueado/LogueadoC/InicioCajero.jsp").forward(request, response);    
                                break;
                            case "Especial":
                            request.getRequestDispatcher("PaginaHTML/Logueado/LogueadoE/InicioEspecial.jsp").forward(request, response);    
                                break;
                            case "Funcionario":
                            request.getRequestDispatcher("PaginaHTML/Logueado/LogueadoT/InicioTrabajador.jsp").forward(request, response);    
                                break;
                            default:
                                throw new AssertionError();
                        }

                    }
                    else {

                        request.setAttribute("Error", "rut o clave incorrecta");
                        request.getRequestDispatcher("PaginaHTML/NoLogueado/LoginNoValido.jsp").forward(request, response);
                        out.print("<h1>Usuario Error<h1>");
                    }

                } catch (Exception e) {
                    request.setAttribute("Error", "Error Desconocido");
                    request.getRequestDispatcher("PaginaHTML/NoLogueado/LoginNoValido.jsp").forward(request, response);
                }    
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
