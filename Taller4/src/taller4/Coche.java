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
public class Coche {
    String color;
    String marca;
    int modelo;
    int caballos;
    int numerodepuertas;
    String matricula;
    
    public Coche(){
        this.color = "";
        this.marca = "";
        this.modelo =0;
        this.caballos = 0;
        this.numerodepuertas = 0;
        this.matricula = "";   
        
    }
    public String getColor(){
        return this.color;
    }
     public String getMarca(){
        return this.marca;
    }
     public int getModelo(){
        return this.modelo;
    }
    public int getCaballos(){
        return this.caballos;
    }
    public int getNumerodepuertas(){
        return this.numerodepuertas;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setColor(String color){
       this.color= color;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(int modelo){
        this.modelo= modelo;
    }
    public void setCaballos(int caballos){
       this.caballos=caballos;
    }
    public void setNumerodepuertas( int numerodepuertas){
        this.numerodepuertas=numerodepuertas;
    }
     public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void mostrardatos(){
        
    }
}
