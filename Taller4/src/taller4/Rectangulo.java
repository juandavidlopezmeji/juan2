/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

/**
 *
 * @author Okami
 */
public class Rectangulo {
     // atributos
    private double ancho;
    private double longuitud;

    // constructor 
    public Rectangulo(){
       this.ancho=0;
       this.longuitud=0;
    }

    //getters y setters
    public double getAncho(){
        return this.ancho;
    }

    public double getLonguitud(){
        return this.longuitud;
    }

    public void setAncho(double b){
        this.ancho = b;
    }

    public void setLonguitud(double altura){
        this.longuitud=altura;
    }

    // metodos miembros

    public double calcularArea(){
        return this.ancho * this.longuitud;
    }
    public double calcularPerimetro(){
        return 2*(this.ancho + this.longuitud);
    }

}
