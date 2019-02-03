package w11day1;

import apcs.Window;

public class Ball {

	int radius = Window.random(5, 25);
	int x = Window.random(radius, Window.width()-radius);
	int y = Window.random(radius, Window.height()-radius);
	
	int dy = 10;
	int dx = 5;
	
	int r;
	int g;
	int b;
	
	public Ball (int r, int g, int b, int dx, int dy) {
		this.dy = dy;
		this.dx = dx;
		this.r = r;
		this.g = g;
		this.b = b;
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
	public void reflect(Ball ball) {
		if (x+radius>=ball.x-ball.radius||x-radius<=ball.x+ball.radius) {
			dx = -dx;
			ball.dx=-ball.dx;
		}
		if (y+radius>=ball.y-ball.radius||y-radius<=ball.y+ball.radius) {
			dy = -dy;
			ball.dy=-ball.dy;
		}
		int leg1 = ball.x-x;
		int leg2 = ball.y-y;
		if(leg1<0) {
			leg1=-leg1;
		} if(leg2<0) {
			leg2 = -leg2;
		}
		if(Math.sqrt((leg1*leg1)+(leg2*leg2))<=ball.radius+radius) {
			dx = -dx;
			dy = -dy;
			System.out.println(dx+" "+ dy);
			System.out.println(ball.dx+""+ball.dy);
		}
		
	}
	public void move() {
			x += dx;
			y += dy;
			reflect();
	}
	public void draw(int r, int g, int b) {
		Window.out.color(r,g,b);
		Window.out.circle(x,y,radius);
		move();
	}
}
