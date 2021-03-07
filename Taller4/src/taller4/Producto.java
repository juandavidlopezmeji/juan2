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
public class Producto {
    private int codigo;
    private String nombre;
    private double preciodecompra;
    private double porcentajedeU;
    
    public Producto(){
        this.codigo=0;
        this.nombre= "";
        this.porcentajedeU=0;
        this.preciodecompra=0;
    }
    public Producto(int co,String nom,double por,double pre ){
        codigo=co;
        nombre= nom;
        porcentajedeU= por;
        preciodecompra=pre;
    }
    public int getCodigo(){return this.codigo;}
    public String getNombre(){return this.nombre;}
    public double getPreciodecompra(){return this.preciodecompra;}
    public double getPorcentajeU(){return this.porcentajedeU;}
    
    public void setCodigo(int codigo){ this.codigo = codigo;}
    public void setNombre(String nombre){this.nombre= nombre;}
    public void setPreciodecompra(double preciodecompra){this.preciodecompra=preciodecompra;}
    public void setPorcentajeU(double porcentaje){this.porcentajedeU=porcentaje;}
    
    public double precioVenta(){
        return (this.preciodecompra+(this.preciodecompra*this.porcentajedeU));
        
    }

    
}
