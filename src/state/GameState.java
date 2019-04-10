/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Sengo
 */
public class GameState extends BasicGameState {

    Image land;

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void init(GameContainer container, StateBasedGame sbg) throws SlickException {
        land = new Image("res/images/Mapa_Pueblo.png");
    }

    @Override
    public void render(GameContainer container, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        grphcs.drawImage(land, 0, 0);
    }

    @Override
    public void update(GameContainer container, StateBasedGame sbg, int i) throws SlickException {
    }

}
