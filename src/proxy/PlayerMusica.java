/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;
import composite.*;

/**
 *
 * @author DESENV
 */
public class PlayerMusica implements Player{
    public void tocar(Playlist p){
        p.play();
    }
}
