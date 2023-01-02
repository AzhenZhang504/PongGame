import java.awt.Color;

public class Paddle extends Sprite {
    
	// Add static final variables for the width, height, colour and distance from edge
	private static final int PADDLE_WIDTH = 10;
    private static final int PADDLE_HEIGHT = 100;
    private static final Color PADDLE_COLOUR = Color.WHITE;
    private static final int DISTANCE_FROM_EDGE = 40;
 
    // Add a constructor that takes the player enum as a parameter
    public Paddle(Player player, int panelWidth, int panelHeight) {
    	//Set the width,height and colour
    	setWidth(PADDLE_WIDTH);
    	setHeight(PADDLE_HEIGHT);
    	setColour(PADDLE_COLOUR);
    	//Set the initial starting position
    	int xPos;
    	if(player == player.One) {
    		xPos = DISTANCE_FROM_EDGE;
    	} else {
    		xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
    	}
    	setInitialPosition(xPos, panelHeight / 2 - (getHeight()/2));
    	//Call resetToInitialPosition()
    	resetToInitialPosition();
    }
}