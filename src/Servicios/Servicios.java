/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import data.*;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Servicios {
    Scanner scanner = new Scanner(System.in);
    public Usuario registrarUsuario(){
        
        System.out.println("Ingresar nombre");
        String nombre= scanner.next();
        System.out.println("Ingresar clave");
        String clave= scanner.next();
        System.out.println("Ingresar edad");
        int edad= scanner.nextInt();
        System.out.println("Ingresar correo");
        String correo= scanner.next();
        Usuario u1=new Usuario(nombre, clave, edad, correo);
        return u1;
    }
    
    public void comentar(Usuario u1, Date Fecha){
        System.out.println("Ingrese comentario:");
        String comentario= scanner.next();
        u1.hacerComentario(comentario, Fecha);
        
    }
    public void subirFoto(Usuario u1, Date Fecha){
        System.out.println("Ingrese ruta:");
        String ruta= scanner.next();
        u1.subirFoto(ruta);
        
    }
}
