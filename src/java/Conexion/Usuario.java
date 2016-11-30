/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
public class Usuario {
private int id;
private String nombre;
private float sueldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toString(){
        String mensaje=null;
        mensaje="El nombre es:"+nombre+" y el sueldo es: "+sueldo+ " es todo...";
        return mensaje;
    }
}

