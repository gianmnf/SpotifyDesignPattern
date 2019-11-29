/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import proxy.*;

/**
 *
 * @author DESENV
 */
public class FactoryPlayer {
    public Player criaPlayer(String Player){
        if(Player.equalsIgnoreCase("free"))
        {
            return new PlayerFree();
        }
        else if(Player.equalsIgnoreCase("premium"))
        {
            return new PlayerMusica();
        }
        return new PlayerFree();
    }
}
