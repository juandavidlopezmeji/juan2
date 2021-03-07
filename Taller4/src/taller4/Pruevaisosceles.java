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
public class Pruevaisosceles {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        Isosceles n= new Isosceles(); 
        double altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura: "));
        double base= Integer.parseInt(JOptionPane.showInputDialog("Introduce Base: "));
       
        n.setAltura(altura);
        n.setBase(base);

        System.out.println("Base: " + n.getAltura());
        System.out.println("Altura: " + n.getBase());
        System.out.println("Area del triangulo isosceles: " + n.calcularArea());
        System.out.println("Angulo del triangulo isosceles: " + n.Angulodcalculo());
        System.out.println("Perimetro del triangulo isosceles: " + n.Calcularperimetro());
        System.out.println("Lados del triangulo isosceles: " + n.Calcularlados());
    }
}
