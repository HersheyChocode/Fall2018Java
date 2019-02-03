package w2day1;

import apcs.Window;

public class Warmup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates width and length variables
		int width = 400;
		int length = 400;
		//Creates a window
		Window.size(width, length);
		//Changes background color
		Window.out.background("yellow");
		//Changes paint color
		Window.out.color("cyan");
		//Makes first circle (top left)
		Window.out.circle(width/4, length/4, width/4);
		//Changes paint color
		Window.out.color("red");
		//Makes second circle (top right)
		Window.out.circle(width/4*3, length/4, width/4);
		//Changes paint color
		Window.out.color("blue");
		//Makes second circle (top right)
		Window.out.circle(width/4, length/4*3, width/4);
		//Changes paint color
		Window.out.color("green");
		//Makes second circle (top right)
		Window.out.circle(width/4*3, length/4*3, width/4);

	}

}
