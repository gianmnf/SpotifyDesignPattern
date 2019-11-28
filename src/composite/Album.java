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
    public Musica m1;
    public Musica m2;
    public Musica m3;
    
    public Album(Musica m1,Musica m2, Musica m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    
    public String getTitulo(){
        return this.m1.getTitulo() + "\n" + this.m2.getTitulo() + "\n" + this.m3.getTitulo();
    }
    
    public float getTempo(){
        System.out.println("Tempo total do album: ");
        return this.m1.getTempo() + this.m2.getTempo() + this.m3.getTempo();
    }
}
