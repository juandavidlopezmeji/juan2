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
public class Trabajador {
    int nhoras ;
    public static double nhorastrabajadas = 200;
    public Trabajador(){}
    public  int getNhoras(){
        return this.nhoras;
    }
    
    public void setNhoras(int nhoras){
       this.nhoras= nhoras;
    }
    
    public double Calcularsaldototal(){
        return this.nhoras * Trabajador.nhorastrabajadas;
    }
}

