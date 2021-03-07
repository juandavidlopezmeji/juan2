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
public class Pruevabicicleta {
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        Bicicleta mibicicleta= new Bicicleta(); 
        int v=30;
        int p=3;
        int pi=5;
   
        mibicicleta.setVelocidadActual(v);
        mibicicleta.setPlatoActual(p);
        mibicicleta.setPiñonActual(pi);
        JOptionPane.showMessageDialog(null,"Velocidad -> " + mibicicleta.getVelocidadActual()+
        "\nPlato-> " + mibicicleta.getPlatoActual() + "\nPeñon-> " + mibicicleta.getPiñonActual()+
        "\nAceleracion-> " + mibicicleta.Acelerar()+ "\nFrenado-> " + mibicicleta.Frenar());
        mibicicleta.CambiarPiñon(4);
        mibicicleta.CambiarPlato(4);
        JOptionPane.showMessageDialog(null,"Velocidad -> " + mibicicleta.getVelocidadActual()+
        "\nPlato-> " + mibicicleta.getPlatoActual() + "\nPeñon-> " + mibicicleta.getPiñonActual()+
        "\nAceleracion-> " + mibicicleta.Acelerar()+ "\nFrenado-> " + mibicicleta.Frenar());

    }
}
