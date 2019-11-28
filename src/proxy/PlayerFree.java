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
public class PlayerFree implements Player{
    PlayerMusica pm = new PlayerMusica();
    public void tocar(Musica m){
        System.out.println("Com o Spotify Premium você pode ouvir música sem anúncios"
                + " e offline por apenas R$16.90. Assine agora e tenha essas vantagens.");
        pm.tocar(m);
    }
}
