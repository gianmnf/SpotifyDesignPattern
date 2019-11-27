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
public class Single implements Musica{
    public String titulo;
    public String artista;
    
    public Single(){
        this.titulo = titulo;
    }
    
    public void setTitulo(String titulo){
            this.titulo = titulo;
    }
    @Override
    public String getTitulo()
    {
        return titulo;
    }
}
