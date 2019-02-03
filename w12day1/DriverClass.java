package w12day1;

import java.util.ArrayList;

import apcs.Window;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ball>balls = new ArrayList<Ball>();
		
		for(int i = 0; i<11; i++) {
			int y = Window.random(0, 20);
			if(y==0) {
				y+=10;
			}
			int r = Window.random(0, 255);
			int g = Window.random(0, 255);
			int b = Window.random(0, 255);		
			balls.add(new Ball(r,g,b,5, y));
		}
		
		while(true) {
			Window.frame();
			Window.out.background("white");
			for(int x = 0; x<balls.size(); x++) {
				balls.get(x).draw();
			}
			for(int x = 0; x<balls.size(); x++) {
				for(int y = 0; y<balls.size(); y++) {
					if(x!=y) {
						balls.get(x).reflect(balls.get(y));
					}
				}
			}
			
		}


	}

}
