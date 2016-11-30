/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.*;
import java.util.ArrayList;

public class Testito {

public static void main (String []algo)throws Exception{
    
 DAOUsuario dao=new DAOUsuario();
 ArrayList<Usuario> usuarios=dao.buscarTodos();
 for(Usuario u:usuarios){
        System.out.println(u);
 }
    }
}