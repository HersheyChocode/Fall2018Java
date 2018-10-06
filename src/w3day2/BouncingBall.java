package w3day2;
import apcs.Window;
public class BouncingBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window.size(700,500);
		
		int x = 100;
		int y = Window.height()/2;
		Window.out.background("white");
		while(1<2) {
			Window.frame();
			Window.out.color("red");
			Window.out.circle(x, y, 50);
			x = x+50;
		}
		
		
		

	}

}
