/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Comentario {
    private String texto; 
    private Date fechaCreacion; 

    public Comentario(String texto, Date fechaCreacion) {
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
