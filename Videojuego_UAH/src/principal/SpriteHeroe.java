package principal;

import modelos.Heroe;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * @author Techno team
 */

/** 
 * Sprite del Heroe
 *
 */
public class SpriteHeroe {

	
	//---------------------------------------------
	//Atributos
	//---------------------------------------------
	
    public Image imgSprite;
    public int heroHeight, heroWidth;

    int durationScalar = (int) (100);

    public int[] duration = {durationScalar, durationScalar, durationScalar};
    public Animation avatar, movingUp, movingDown, movingLeft, movingRight;

    
	//---------------------------------------------
	//Metodos
	//---------------------------------------------
	
    /**
     * Sprite del protagonista
     * @throws SlickException
     */
    public SpriteHeroe() throws SlickException {

        imgSprite = new Image("graphic/heroSprite/avatars" + Estado_Juego.spriteNumber + ".png");

        int widthSubImageLength = 3;

        this.heroHeight = imgSprite.getHeight() / 4;
        this.heroWidth = imgSprite.getWidth() / widthSubImageLength;

        Image[] walkDown = new Image[widthSubImageLength];
        Image[] walkLeft = new Image[widthSubImageLength];
        Image[] walkRight = new Image[widthSubImageLength];
        Image[] walkUp = new Image[widthSubImageLength];

        for (int w = 0, h = 0; w < imgSprite.getWidth(); w += heroWidth) {
            walkDown[h] = imgSprite.getSubImage(w, heroHeight * 0, heroWidth, heroHeight);
            walkUp[h] = imgSprite.getSubImage(w, heroHeight * 3, heroWidth, heroHeight);
            walkLeft[h] = imgSprite.getSubImage(w, heroHeight * 1, heroWidth, heroHeight);
            walkRight[h] = imgSprite.getSubImage(w, heroHeight * 2, heroWidth, heroHeight);
            h++;
        }

        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);
        movingUp = new Animation(walkUp, duration, false);

        avatar = movingDown;
    }

}
