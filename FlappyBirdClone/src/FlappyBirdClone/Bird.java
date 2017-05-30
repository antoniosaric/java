package FlappyBirdClone;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Bird implements Updatable, Renderable {

	private float x,y;
	private float yVel;
	private float baseYVel = -6.0f;
	private float gravity = 0.25f;
	
	private Pipes pipes;
	private int scoredPipe = 0;
	
	private int sore = 0;
	
	private Font gameFont = new Font("Arial", Font.BOLD, 30);
	
	private BufferedImage flapUp;
	private BufferedImage flapDown;
	
	public Bird(Pipes pipes) {
		resetBird();
		
		this.pipes = pipes;
		
		try {
			flapUp = Sprite.getSprite("bird_up.png");
			flapDown = Sprite.getSprite("bird_down.png");
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
			System.exit(1);
		}
	}
	
	
	public void resetBird() {
		x = 100;
		y = 100;
		yVel = baseYVel;
	}
	
	private void flap() {
		yVel = baseYVel;
	}
	
	@Override 
	public void update(Input input) {}
	
	@Override
	public void render(Graphics2D g, float interpolation) {}
	
	
	
}
