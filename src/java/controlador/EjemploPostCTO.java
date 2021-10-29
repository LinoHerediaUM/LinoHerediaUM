/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ContactoDAO;
import modelo.dto.ContactoDTO;

/**
 *
 * @author Lino Heredia
 */
public class EjemploPostCTO extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EjemploPostCTO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EjemploPostCTO at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
       String accion=request.getParameter("accion");
       if(accion.equalsIgnoreCase("listar")){
         
       ContactoDAO dao = new ContactoDAO();
       List<ContactoDTO> lista=dao.readAll();
       request.setAttribute("list", lista);
       request.getRequestDispatcher("VerPost.jsp").forward(request, response);
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
//        processRequest(request, response);
      String n=request.getParameter("nombre"); //envio nombre de la casilla del formulario donde esta la información
      String c=request.getParameter("correo");
      String m=request.getParameter("mensaje");
      
      ContactoDTO dto= new ContactoDTO(n,c,m);
      ContactoDAO dao= new ContactoDAO();
      dao.create(dto);
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Se registro un nuevo mensaje </h1>");
            out.println("<a href=index.jsp> principal</a>");
            out.println("</body>");
            out.println("</html>");
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
