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
public class Cuenta {
    private int nocuenta;
    private String nombrecliente;
    private double saldo;
    
    
    public Cuenta(){}
    
    public int getNocuenta(){ return this.nocuenta;}
    public String getNombrecliente(){return this.nombrecliente;}
    public double getSaldo(){ return this.saldo;}
    
    public void setNocuenta(int n){this.nocuenta=n;}
    public void setNombrecliente(String name){this.nombrecliente=name;}
    public void setSaldo(double v){this.saldo=v;}
    
    public boolean Consignar(double monton){
        if(monton>0){
            this.saldo += monton;   
        }
        return true;
    }
    public boolean Retirar(double monton){
        if(this.saldo-monton<0){
            this.saldo = 0;
        }else{
            this.saldo-= monton;
        }
        return true;
    }
}
