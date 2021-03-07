/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Okami
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic her

        Rectangulo r= new Rectangulo(); 
        double x= Integer.parseInt(JOptionPane.showInputDialog("--Introduce longuitud--"));
        double y= Integer.parseInt(JOptionPane.showInputDialog("---Introduce Ancho---"));
       
        r.setLonguitud(x);
        r.setAncho(y);

        System.out.println("Base: " + r.getLonguitud());
        System.out.println("Altura: " + r.getAncho());
        System.out.println("Area de rectangulo: " + r.calcularArea());
        System.out.println("Prerimetro del rectangulo: " + r.calcularPerimetro());

        


    }
}
