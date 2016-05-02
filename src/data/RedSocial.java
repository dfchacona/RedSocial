/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class RedSocial {
    private ArrayList <Usuario> usuarios; 
    private ArrayList <Comentario> comentarios; 
    private ArrayList <Fotografia> fotografias; 

    public RedSocial() {
        this.usuarios = new <Usuario> ArrayList();
        this.comentarios = new <Comentario> ArrayList();
        this.fotografias = new <Fotografia> ArrayList();
    }
    
    public void anadirUsuario(Usuario u1){
        
        usuarios.add(u1);
    }
    public void anadirComentario(Comentario c1){
        
        comentarios.add(c1);
    }
}
