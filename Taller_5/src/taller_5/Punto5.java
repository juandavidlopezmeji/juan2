/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_5;

import java.util.Scanner;

/**
 *
 * @author Okami
 */
class Res {
    public String numeroSerie;
    public int edad;
    public char sexo;
    public double peso;
    
    
}
public class Punto5{
    public static Res[] listaReses = new Res[100];
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] arg){
        preguntaDatoss();
    }
    public static void preguntaDatoss(){
        char eleccion;
        int cantidadres=0;
        do{
            Res nuevaRes = new Res();
            System.out.println("REGISTRAR NUEVA RES.\n");
            System.out.print("Codigo=> ");
            nuevaRes.numeroSerie= entrada.nextLine();
            ListaReses[cantidadres]=nuevaRes;
            cantidadres++;
            
        }
    }
}