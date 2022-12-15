package application;

import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FishSlayer extends Application{
//	variables
	private static final Random RAND = new Random();
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final int PLAYER_SIZE = 60;
	
	static final Image PLAYER_IMG = new Image("file:src/application/img/player.png");
	static final Image CAUGHT_IMG = new Image("file:src/application/img/caught.png");
	
	static final Image FISHES_IMG[] = {
		new Image("file:src/application/img/01.png"),
		new Image("file:src/application/img/02.png"),
		new Image("file:src/application/img/03.png"),
		new Image("file:src/application/img/04.png"),
		new Image("file:src/application/img/05.png"),
		new Image("file:src/application/img/06.png"),
		new Image("file:src/application/img/07.png"),
		new Image("file:src/application/img/08.png"),
		new Image("file:src/application/img/09.png"),
		new Image("file:src/application/img/10.png"),
		new Image("file:src/application/img/11.png"),
		new Image("file:src/application/img/12.png")
	};
	
	final int MAX_FISHES = 12;
	final int MAX_SHOTS = MAX_FISHES;
	boolean gameOver = false;
	private GraphicsContext gc;
	
	Ship player;
	List<Net> nets;
	List<Ocean> oceans;
	List<Fish> fishes;
	
	@Override public void start(Stage arg0) throws Exception {
	}
	
//	player
	public class Ship {
		int posX, posY, size;
		Image img;
//		boolean exploding, destroyed;
//		int explosionStep = 0;
		
		public Ship(int posX, int posY, int size, Image image) {
			this.posX = posX;
			this.posY = posY;
			this.size = size;
			img = image;
		}
		
		public Net shoot() {
			return new Net(posX+size / 2 - Net.size / 2, posY - Net.size);
		}
		
		public void update() {
//			if (exploding) explosionStep++;
//			destroyed = explosionStep > EXPLOSION_STEPS;
		}
		
		public void draw() {
//			if (exploding) {
//				gc.drawImage(EXPLOSION_IMG, explosionStep % EXPLOSION_COL * EXPLOSION_W, 
//						(explosionStep / EXPLOSION_ROWS) * EXPLOSION_H + 1, EXPLOSION_W, EXPLOSION_H, posX, posY, size, size);
//			} else {
//				gc.drawImage(img, posY, posX, size, size);
//			}
		}
		
		public boolean collide(Ship other) {
			int d = distance(this.posX + size / 2, this.posY + size / 2, 
					other.posX + other.size / 2, other.posY + other.size / 2);
			return d < other.size / 2 + this.size / 2;
		}
		
		public void explode() {
//			exploding = true;
//			explosionStep = -1;
		}
	}
}