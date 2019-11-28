/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author DESENV
 */
public class Playlist {
    List<Musica> musicas = new ArrayList<>();
    
    public void play(){
    for(Musica m : musicas){
        System.out.println(m.getTitulo() + " - " + m.getTempo());
    }
    }
    
    public void addMusica(Musica m){
        this.musicas.add(m);
    }
}
