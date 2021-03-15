/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_5;

/**
 *
 * @author Okami
 */
public class Parrafo {
    public String texto;
    
    public Parrafo(){
        this.texto= "";
                
    }
    
    public Parrafo(String texto){
        this.texto=texto;
    }
    public String getTexto(){
        return this.texto;
    }
    public void setTexto(String texto){this.texto = texto;}
    
    public void nVocales(){
        for(int i=0;i<this.texto.length();i++){
            char caracter = Character.toLowerCase(texto.charAt(i));
            switch (caracter) {
            case 'a':
                caracter[0]++;
                break;
            case 'e':
                vocales[1]++;
                break;
            case 'i':
                vocales[2]++;
                break;
            case 'o':
                vocales[3]++;
                break;
            case 'u':
                vocales[4]++;
                break;
            default:
                break;
            }
        }
    }

}
