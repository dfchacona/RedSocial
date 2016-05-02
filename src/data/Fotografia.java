/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Estudiante
 */
public class Fotografia {
    private String ruta;
    private  Etiqueta [] etiquetas;
    private int numeroEtiquetas;

    public Fotografia(String ruta) {
        this.ruta = ruta;
        this.etiquetas = new Etiqueta [5];
    }
    
    public void etiquetar(Etiqueta etiqueta){
       this.etiquetas[this.numeroEtiquetas]=etiqueta;
       this.numeroEtiquetas++;
    }
}
