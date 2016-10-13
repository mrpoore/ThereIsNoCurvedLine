// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.

import java.awt.*;
import java.applet.*;

public class GraphicsLab02st extends Applet {
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		g.drawRect(10, 10, width, height);
		
		//top right corner
		int x1 = 10;
		int y1 = 640;
		int x2 = 9990;
		int y2 = 640;
		
		//loop x1 from 10 to 990 by adding 14
		for (x1 = 10; x1 < 990; x1 += 14) {	
			//draw da line
			g.drawLine(x1, y1, x2, y2);
			//subtract 9 from y2 
			y2 -= 9;
		}
		
		//bottom left corner
		
		//starting coordinates
		x1 = 10;
		y1 = 10;
		x2=10;
		y2=640;
	}
}
