package w9day1;

import apcs.Window;

public class Bird {
	static int gravity = 5;
	int radius = 10;
	int x = Window.width()/8;
	int y = Window.height()/2;
	
	public void draw() {
		Window.out.circle(x, y, radius);
	}
	
	public void move(String upKey) {
		y+=gravity;
		gravity+=1;
		if (Window.key.pressed(upKey)){
			y-=15;
			gravity = 5;
		}
	}
	
	public boolean makeContact(Pipe p) {
		if(x+radius>=p.x-p.width/2&&x-radius<=p.x+p.width/2&&((y+radius>=p.y2-p.height2/2)||(y-radius<=p.y1+p.height/2))) {
				return true;
		}
		return false;
	}
	
}