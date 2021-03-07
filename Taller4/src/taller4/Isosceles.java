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
public class Isosceles {
      // atributos
    private double base;
    private double altura;

    // constructor 
    public Isosceles(){
       this.base=0;
       this.altura=0;
    }

    //getters y setters
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    // metodos miembros

    public double calcularArea(){
        return (this.base* this.altura)/(double) 2;
    }
    public double Angulodcalculo(){
        double f= (this.base / (double)2);
        double anguloRadianes = Math.atan(f/this.altura);
        double angulo = Math.toDegrees(anguloRadianes);
        int grados= (int)angulo;
        return ((90-grados)*2);
    }
    public double Calcularlados(){
        double valor = Math.cos(Angulodcalculo());
        return (this.altura/valor);
    }
    public double Calcularperimetro(){
        return ((Calcularlados()*2)+ this.base);
    }

}
