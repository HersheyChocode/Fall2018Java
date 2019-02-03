package w5day1;
import apcs.Window;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window.size(500, 500);
		
		Ball ball1 = new Ball("red",5,6);
		Ball ball2 = new Ball("dark red",-10,-6);
		Ball ball3 = new Ball("pink",6,6);
		Ball ball4 = new Ball("hot pink",4,6);
		Ball ball5 = new Ball("purple",8,-6);
		Ball ball6 = new Ball("violet",6,6);
		
		while(true) {
			Window.frame();
			Window.out.background("white");
			//ball1.move();
			ball1.draw();
			ball2.draw();
			ball3.draw();
			ball4.draw();
			ball5.draw();	
			ball6.draw();			
		}
	}

}
