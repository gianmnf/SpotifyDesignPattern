/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import proxy.*;
import composite.*;
/**
 *
 * @author DESENV
 */
public class SpotifyDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Musica a = new Single("Chocolate Show - Cassia Eller",5.50f);
        Musica s = new Single("Single Ladies - Beyonce",3.30f);
        Musica x = new Single("The Time(Dirty Bit) - Black Eyed Peas",6.25f);
        Musica xx = new Album(a,s,x);
        Playlist p = new Playlist();
        Playlist alb = new Playlist();
        alb.addMusica(xx);
        p.addMusica(a);
        PlayerFree m = new PlayerFree();
        m.tocar(alb);
    }
    
}
