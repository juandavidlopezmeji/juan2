/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.util.Scanner;
import static taller4.Pruebacoche.crearcoche;

/**
 *
 * @author Okami
 */
public class Pruebacoche {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic her

        System.out.println("Introduce color");
        String color= entrada.next();
        System.out.println("Introduce marca");
        String marca= entrada.next();
        System.out.println("Introduce modelo");
        int modelo= entrada.nextInt();
        System.out.println("Introduce caballos");
        int caballos= entrada.nextInt();
        System.out.println("Introduce #puertas");
        int numerodepuertas= entrada.nextInt();
        String matricula= entrada.next("Introduce matricula");
        Coche coche_1= crearcoche(color,marca,modelo,caballos,numerodepuertas,matricula); 
        printinfocoche(coche_1);
    }
    public static Coche crearcoche(String marca,String color,int numerodepuertas,int modelo,int caballos,String matricula){
        Coche coche = new Coche();
        coche.setColor(color);
        coche.setMarca(marca);
        coche.setModelo(modelo);
        coche.setCaballos(caballos);
        coche.setNumerodepuertas(numerodepuertas);
        coche.setMatricula(matricula);
        return coche;
    }
    public static void printinfocoche(Coche coche){
        
        System.out.println("color: " + coche.getColor());
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Caballos: " + coche.getCaballos());
        System.out.println("# Puertas: " + coche.getNumerodepuertas());
        System.out.println("Matricula: " + coche.getMatricula());
    }
   
}
