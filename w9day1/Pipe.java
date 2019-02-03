package w9day1;

import apcs.Window;

public class Pipe {
	int x;
	int width = Window.width()/10;
	int gapSize = Window.random(Window.height()/8, Window.height()/2);
	int height = Window.random(0, Window.height()-gapSize);
	int y1 = height/2;
	int height2 = Window.height()-(gapSize+height);
	int y2 = Window.height()-height2/2;
	int startVal;
	int gap = 300;
	Pipe(int startVal){
		x = Window.width()+startVal;
		this.startVal=startVal;
	}
	public void draw() {
		Window.out.rectangle(x, y1, width, height);
		Window.out.rectangle(x, y2, width, height2);
	}
	public void move() {
		x -=10;
		draw();
		if(x==-gap) {
			x = Window.width()+width/2;
		} 
	}
}