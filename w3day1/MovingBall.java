package w3day1;
import apcs.Window;
public class MovingBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 600;//int for width
		int height = 500;//int for height
		Window.size(width,height);//Creates window
		
		int x = width/2;//x
		int y = height/2;//y
		int dx = 10;//direction for x
		int dy = 10;//direction of y
		int rad = 50;//radius for circle
		while(true) {
			Window.frame();//frame
			Window.out.background("purple");
			Window.out.color("light pink");//paintbrush color = red
			Window.out.circle(x, y, rad);//creates circle
			//if x = left edge or right edge
			if (x==rad||x>=width-rad) {
				dx = -dx; //oppose the direction
			} 			
			//if y = top edge or bottom edge
			if (y+rad>=height) {
				dy = -dy;//oppose the direction
			}
			if (y<=rad) {
				dy = -dy;
			}
			x = x+dx;
			y = y + dy;
		}
		
		
		

	}

}
