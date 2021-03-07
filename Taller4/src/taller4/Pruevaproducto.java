/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.util.Scanner;

/**
 *
 * @author Okami
 */
public class Pruevaproducto {
    public static void main(String arg[]){
        Scanner leer = new Scanner(System.in);
        int x=0;
        System.out.print("ingrese numero de productos-> ");
        x= leer.nextInt();
        Producto a[]= new Producto[x];
        int codigo;
        double porcentaje;
        double precio;
        for(int i=0;i<a.length;i++){
            System.out.print("ingrese codigo-> ");
            codigo= leer.nextInt();
            System.out.print("ingrese nombre-> ");
            leer.nextLine();
            String nombr= leer.nextLine();
            System.out.print("ingrese porcentaje de compra-> ");
            porcentaje= leer.nextDouble();
            System.out.print("ingrese precio del producto-> ");
            precio= leer.nextDouble();
            a[i]=new Producto(codigo,nombr,porcentaje,precio);
        }
        for(int i=0;i<a.length;i++){
            System.out.print("------------------------------------------------- ");
            System.out.print("\nCodigo-> "+a[i].getCodigo()+"\nNombre-> "+a[i].getNombre()+"\nPorcentaje-> "+a[i].getPorcentajeU()+
            "\nPrecio-> "+a[i].getPreciodecompra()+ "\nPrecio de venta al publico-> "+a[i].precioVenta());
        }
       
    }
}
