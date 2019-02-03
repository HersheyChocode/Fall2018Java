package w11day1;
import apcs.*;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball[] arrOfBalls = new Ball[4];
		Window.size(600, 700);
		Window.out.background("light blue");
		for(int x = 0; x<arrOfBalls.length; x++) {
			int y = Window.random(0, 20);
				if(y==0) {
					y+=10;
				}
			int r = Window.random(0, 255);
			int g = Window.random(0, 255);
			int b = Window.random(0, 255);
			
			arrOfBalls[x]= new Ball(r,g,b,5, y);
			arrOfBalls[x].draw(r,g,b);
		}
		while(true) {
			Window.frame();
			Window.out.background("white");
			for(int x = 0; x<arrOfBalls.length; x++) {
				arrOfBalls[x].draw(arrOfBalls[x].r, arrOfBalls[x].g, arrOfBalls[x].b);
			}
			for(int x = 0; x<arrOfBalls.length; x++) {
				for(int y = 0; y<arrOfBalls.length; y++) {
					if(x!=y) {
						arrOfBalls[x].reflect(arrOfBalls[y]);
					}
				}
			}
			
		}

	}

}