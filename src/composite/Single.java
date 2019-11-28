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
    public float tempo;
    public Single(String titulo, float tempo)
    {
        this.titulo = titulo;
        this.tempo = tempo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public float getTempo(){
        return tempo;
    }
}
