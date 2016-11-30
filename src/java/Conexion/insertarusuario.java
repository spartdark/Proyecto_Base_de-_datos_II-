/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-201
 */
@WebServlet(name = "insertarusuario", urlPatterns = {"/insertar-usuario"})
public class insertarusuario extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="datos no insertados";
        
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        Float sueldo = Float.parseFloat(request.getParameter("sueldo"));
        
        Usuario u=new Usuario();
        u.setId(id);
        u.setNombre(nombre);
        u.setSueldo(sueldo);
        
        DAOUsuario dao=new DAOUsuario();
        try {
            dao.insertarUsuario(u);
            mensaje="Tu usuario se guardo con exito ";
        } catch (Exception ex){
            mensaje=ex.getMessage();
        }
            out.println(mensaje);
           
            
        }
    }
