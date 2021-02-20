import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 200;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/3;
	private static final int EYE_X = HEAD_DIMENSION/3;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/2;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 25;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/4 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// pick nose height, width is based on head dimension
	private static final int NOSE_HEIGHT = 30;
	private static final int NOSE_WIDTH = HEAD_DIMENSION/4;
		
	private static final int NOSE_X = HEAD_DIMENSION/4 * 2;
	private static final int NOSE_Y = HEAD_DIMENSION/5 * 3 - 30;
	
	// pick hat height, width is based on head dimension
	private static final int HAT_HEIGHT = 40;
	private static final int HAT_WIDTH = HEAD_DIMENSION/2;
			
	private static final int HAT_X = HEAD_DIMENSION/4;
	private static final int HAT_Y = -20 ;
		
		
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the hat
		g2.setColor(Color.ORANGE);
		int x = catX + HAT_X;
		int y = catY + HAT_Y;
		g2.fillOval(x, y, HAT_WIDTH, HAT_HEIGHT);
						
				
		x=catX;
		y=catY;
		// Draw the head
		g2.setColor(Color.darkGray);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.red);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.red);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		
		// Draw the mouth
		g2.setColor(Color.red);
		x = catX + NOSE_X;
		y = catY + NOSE_Y;
		g2.fillOval(x, y, NOSE_WIDTH, NOSE_HEIGHT);
		
					
		g2.setColor(Color.red);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("HISS!", catX, catY+HEAD_DIMENSION+10);	
	}
}
