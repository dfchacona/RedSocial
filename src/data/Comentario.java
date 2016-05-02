/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Comentario {
    private String texto; 
    private Calendar fechaCreacion; 
    private Usuario creador; 

    public Comentario(String texto, Calendar fechaCreacion) {
        this.texto = texto;
        this.fechaCreacion = fechaCreacion;
        
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }
    
    
}
