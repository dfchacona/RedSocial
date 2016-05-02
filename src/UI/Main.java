/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import data.*;
import Servicios.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Date fecha= new Date(2016, 05, 02);
        RedSocial facebook= new RedSocial();
        Servicios s=new Servicios();
        int eleccion=1; 
        System.out.println("Digite:"
                + "\n 1. Para registrar usuario"
                + "\n 2. Para realizar comentario"
                + "\n 3. Para subir una foto"
                + "\n 4. Para etiquetar una foto"
                );
        switch (eleccion){
            case 1:{
                facebook.anadirUsuario(s.registrarUsuario());
            }
            case 2:{
                System.out.println("Ingrese usuario");
                String nombreU= scanner.next();
                for(Usuario u1: facebook.getUsuarios()){
                    if(u1.getNombre()==nombreU){
                        Usuario u= u1;
                        s.comentar(facebook, u1, fecha);
                        break; 
                    }
                }
                
            }
        }
       
        
    }
}
