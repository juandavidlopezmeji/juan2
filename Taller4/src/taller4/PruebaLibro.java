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
public class PruebaLibro {
    public static void main(String arg[]){
        Scanner lee = new Scanner(System.in);
        Libro milibro= new Libro(); 
        System.out.print(" Titulo-> ");
        String titulo = lee.nextLine();
        System.out.print("primer nombre-> ");
        String pnombre = lee.nextLine();
        System.out.print("segundo nombre-> ");
        String snombre = lee.nextLine();
        System.out.print("apellido-> ");
        String apellido = lee.nextLine();
        System.out.print("isbn-> ");
        String isbn = lee.nextLine();
        System.out.print("paginas-> ");
        String pagina = lee.nextLine();
        System.out.print("edicion-> ");
        String edicion = lee.nextLine();
        System.out.print("editorial-> ");
        String editorial = lee.nextLine();
        System.out.print("ciudad-> ");
        String ciudad = lee.nextLine();
        System.out.print("pais-> ");
        String pais = lee.nextLine();
        System.out.print("feche de edicion-> ");
        String fecha = lee.nextLine();
        
        milibro.setCiudad(ciudad);
        milibro.setCiudad(pnombre);
        milibro.setSnombre(snombre);
        milibro.setEditorial(editorial);
        milibro.setIsbn(isbn);
        milibro.setPaginas(pagina);
        milibro.setEdicion(edicion);
        milibro.setFechadeedicion(fecha);
        milibro.setPapellido(apellido);
        milibro.setTitulo(titulo);
        milibro.setPais(pais);
        milibro.setPapellido(pagina);
        
        
        System.out.print("----------------------------------\nTitulo: "+milibro.getTitulo()+ "\n"+milibro.getEdicion()+" edicion\nAutor: "+milibro.getPnombre()+" "+milibro.getSnombre()+" "+
        milibro.getPapellido()+"\nISBN: "+milibro.getIsbn()+"\n"+milibro.getEditorial()+", "+milibro.getCiudad()+"("+milibro.getPais()+") , "+milibro.getFechadeedicion()+
        "\n"+milibro.getPaginas()+" paginas\n");
    

    }
}
