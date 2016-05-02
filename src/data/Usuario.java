/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Exception.*;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Usuario {
    private String nombre; 
    private String clave; 
    private int edad; 
    private String correo; 

    public Usuario(String nombre, String clave, int edad, String correo) {
        this.nombre = nombre;
        this.clave = clave;
        this.edad = edad;
        this.correo = correo;
    }
    public void hacerComentario (String comentario, Date fecha){
        Comentario c1= new Comentario(comentario, fecha);
    }
    public void subirFoto(String ruta){
        Fotografia f1= new Fotografia(ruta);
    }
    
}
