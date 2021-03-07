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
public class Pruevatrabajador {
    public static void main(String arg[]){
        Trabajador.nhorastrabajadas=200;
        Trabajador juan = new Trabajador();
        juan.setNhoras(50);
        System.out.println("sueldo juan: "+ juan.Calcularsaldototal());
    }
    
}
