package w5day1;

import apcs.Window;

public class Ball {	
	
	//variables
	int radius = 10;
	int x = Window.random(radius, Window.width()-radius);
	int y = Window.random(radius, Window.height()-radius);
	String color = "red";
	
	int dy = 10;
	int dx = 5;
	
	public Ball (String col, int dx, int dy) {
		this.color = col;
		this.dy = dy;
		this.dx = dx;
	}
	
	//methods
	public void reflect() {
		if (x-radius<=0||x+radius>=Window.width()) {
			dx = -dx;
		}
		if (y-radius<=0||y+radius>=Window.height()) {
			dy = -dy;
		}
	}
	public void move() {
			x += dx;
			y += dy;
			reflect();
	}
	public void draw() {
		Window.out.color(color);
		Window.out.circle(x,y,radius);
		move();
	}
}
