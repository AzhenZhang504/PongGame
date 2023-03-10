import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
public class PongPanel extends JPanel implements ActionListener, KeyListener {
	
		 private final static Color BACKGROUND_COLOUR = Color.BLACK;
		 private final static int TIMER_DELAY = 5; 
		 
		 //Add a GameState variable named 'gameState', set the default value of gameState to .GameState.Initialsing
		 GameState gameState = GameState.INITIALISING;
		 
		 //Remove this variable and replacing its use the new gameState variable
		
		 /*Create a Boolean variable that will be set to true when the game 
		 has finished initialisation and the objects have been successfully */
		 //boolean gameInitialised = false;
		 
		 // Add a ball variable to the PongPanel class
		 Ball ball;
		 // Declare variable 
		 Paddle paddle1, paddle2;
		 
		  public PongPanel() {
		  
		      setBackground(BACKGROUND_COLOUR);
		      Timer timer = new Timer(TIMER_DELAY, this);
		      timer.start();
		      }
		  
		  // Create a new method createObject() that creates the ball object
		  public void createObjects() {
			  ball = new Ball(getWidth(), getHeight());
			  //Create the paddles 
			  paddle1 = new Paddle(Player.One, getWidth(), getHeight());
			  paddle2 = new Paddle(Player.Two, getWidth(), getHeight());
		  }
		  
		 // Use a switch statement and refer to each of the states in the enumerator
		  private void update() {
			  switch(gameState) {
			  case INITIALISING: {
			  createObjects();
			  gameState = GameState.PLAYING;
			  break;
			  }
			  case PLAYING: {
				  break;
				  }
			  case GAMEOVER: {
				  break;
				  }
			  }
			  }
		  
		  // Create a new method called paintSprite()
		  private void paintSprite(Graphics g, Sprite sprite) {
	           g.setColor(sprite.getColour());
	           g.fillRect(sprite.getxPosition(), sprite.getyPosition(), sprite.getWidth(), sprite.getHeight());
	       }
		  
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		update();
		repaint();
	}

	@Override
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 paintDottedLine(g);
		 //Update the paintComponment() method
		 //delete "if(gameInitialised)"
		 if(gameState != GameState.INITIALISING) {
			 // Call paintSprite() for the ball in the paintComponent() method
			 paintSprite(g, ball);
			 // Paint  paddles
			 paintSprite(g, paddle1);
			 paintSprite(g, paddle2);
		 }
	 }
	
	private void paintDottedLine(Graphics g) {
		      Graphics2D g2d = (Graphics2D) g.create();
		         Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
		         g2d.setStroke(dashed);
		         g2d.setPaint(Color.WHITE);
		         g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
		         g2d.dispose();
		}
	
}
