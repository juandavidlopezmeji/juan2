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
public class Libro {
    private String titulo,pnombre,pais,ciudad,paginas,snombre;
    private String edicion,editorial,isbn,papellido,fechadeedicion;
    
    public Libro(){
        this.ciudad="";this.editorial=""; this.fechadeedicion=""; this.isbn=""; this.snombre="";
        this.edicion="";this.paginas=""; this.pais="";this.papellido="";this.pnombre="";this.titulo="";

    }
    public String getCiudad(){return this.ciudad;}
    public String getPnombre(){return this.pnombre;}
    public String getSnombre(){return this.snombre;}
    public String getTitulo(){return this.titulo;}
    public String getPapellido(){return this.papellido;}
    public String getFechadeedicion(){return this.fechadeedicion;}
    public String getEditorial(){return this.editorial;}
    public String getIsbn(){return this.isbn;}
    public String getPais(){return this.pais;}
    public String getPaginas(){return this.paginas;}
    public String getEdicion(){return this.edicion;}
    
    
    public void setCiudad(String ciudad){this.ciudad=ciudad;}
    public void setPnombre(String pnombre){ this.pnombre=pnombre;}
    public void setSnombre(String snombre){this.snombre= snombre;}
    public void setTitulo(String titulo){this.titulo= titulo;}
    public void setPapellido(String papellido){ this.papellido= papellido;}
    public void setFechadeedicion(String fechadeedicion){ this.fechadeedicion=fechadeedicion;}
    public void setEditorial(String editorial){ this.editorial=editorial;}
    public void setIsbn(String isbn){this.isbn=isbn;}
    public void setPais(String pais){ this.pais=pais;}
    public void setPaginas(String paginas){ this.paginas=paginas;}
    public void setEdicion(String edicion){this.edicion=edicion;}
    
    
    
}
