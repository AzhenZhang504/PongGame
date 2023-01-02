import java.awt.Color;
// Ball inherits form the Sprite class
public class Ball extends Sprite {
	// Add final static variables for the width
	  private static final int BALL_WIDTH = 25;
	  // Add final static variables for the height
      private static final int BALL_HEIGHT = 25;
      // Add final static variables for the color
      private static final Color BALL_COLOUR = Color.WHITE;
      // Add constructor that set the color,width and height of the ball
      // A width and height parameter of the panel size should be provided
      public Ball(int panelWidth, int panelHeight) {
    	  setWidth(BALL_WIDTH);
    	  setHeight(BALL_HEIGHT);
    	  setColour(BALL_COLOUR);
    	  // Set initial starting position  
    	  /*It begins by taking the width of the panel and dividing it in half(panelWidth / 2) and 
    	  then subtracting half of the ball width (getWidth() / 2） to make the middle of the ball in the 
    	  middle of the x-axis*/
    	  setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
    	  // Call resetToInitialPosition()
          resetToInitialPosition();
      }
}
