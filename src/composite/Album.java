/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author DESENV
 */
public class Album implements Musica{
    public Single s1,s2,s3,s4,s5;
    public String titulo,artista;
    
    public Album(Single s1, Single s2, Single s3, Single s4, Single s5,String titulo, String artista){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.titulo = titulo;
        this.artista = artista;
    }
    
    public String getTitulo(){
        return this.s1.getTitulo() + "\n" + this.s2.getTitulo() + "\n" + 
                this.s3.getTitulo() + "\n" + this.s4.getTitulo() + "\n" +
                this.s5.getTitulo();
    }
    
    public String getArtista(){
        return artista;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
}
