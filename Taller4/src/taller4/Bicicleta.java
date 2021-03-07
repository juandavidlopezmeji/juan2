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
public class Bicicleta {
    private int velocidadActual, platoActual, piñonActual;
    
    public Bicicleta(){
        this.velocidadActual = 0;
        this.piñonActual = 0;
        this.platoActual = 0;
    }
    
    
    public double getVelocidadActual(){return this.velocidadActual;}
    public double getPlatoActual(){return this.platoActual;}
    public double getPiñonActual(){return this.piñonActual;}
    
    
    public void setVelocidadActual(int velocidadActual){this.velocidadActual = velocidadActual;}
    public void setPlatoActual(int platoActual){this.platoActual = platoActual;}
    public void setPiñonActual(int piñonActual){this.piñonActual = piñonActual;}
    
    
    public int Acelerar(){
        return (this.velocidadActual* 2);
    }
    public double Frenar(){
        return (this.velocidadActual/(double) 2);
    }
    public int CambiarPlato(int platoActual){
        return (this.platoActual = platoActual);
    }
    public int CambiarPiñon (int piñonActual){
        return (this.piñonActual = piñonActual);
    }
    public void mostrardatos(){
        
    }
}
