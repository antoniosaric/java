package FlappyBirdClone;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Game {
	
	public final static int WIDTH = 800, HEIGHT = 600;
	
	private String gameName = "Flappy Bird";
	
	private Canvas game = new Canvas();
	
	private Input input;
	
	private ArrayList<Updatable> updatable = new ArrayList<>();
	private ArrayList<Renderable> renderable = new ArrayList<>();
	
	
	public void start() {
		
		Dimension gameSize = new Dimension(Game.WIDTH, Game.HEIGHT);
		JFrame gameWindow = new JFrame(gameName);
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setSize(gameSize);
		gameWindow.setResizable(false);
		gameWindow.setVisible(true);
		game.setSize(gameSize);
		game.setMinimumSize(gameSize);
		game.setMaximumSize(gameSize);
		game.setPreferredSize(gameSize);
		gameWindow.add(game);
		gameWindow.setLocationRelativeTo(null);
		
		input = new Input();
		
		boolean running = true;
		while (running) {
			
		}

	}
	private void update() {
		for (Updatable u : updatable) {
		u.update(input);
		}
	}
	
		
	private void render(float interpolation) {
		BufferStrategy b = game.getBufferStrategy();
		if (b == null) {
			game.createBufferStrategy(2);
			return;
		}
		
		Graphics2D g = (Graphics2D) b.getDrawGraphics();
		g.clearRect(0, 0, game.getWidth(), game.getHeight());
		
		for (Renderable r : renderable) {
			r.render(g, interpolation);
		}
		g.dispose();
		b.show();
		
	}
	
}
