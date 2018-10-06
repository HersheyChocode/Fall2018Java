package w2day2;
import apcs.Window;
public class Homework1 {
	public static void main(String[] args) {
		Window.size(400,200);
		Window.out.background("black");
		//Japan flag
		/*
		Window.out.color("white");
		Window.out.rectangle(100, 50, 200, 100);
		Window.out.color("red");
		Window.out.circle(100, 50, 50);*/
		//Denmark flag
		/*
		Window.out.rectangle(300, 50, 200, 100);
		Window.out.color("white");
		Window.out.rectangle(275, 50, 20, 100);
		Window.out.rectangle(300, 50, 200, 20);*/
		//Italy Flag
		/*
		Window.out.color("green");
		Window.out.rectangle(33, 150, 66, 100);
		Window.out.color("white");
		Window.out.rectangle(99, 150, 66, 100);
		Window.out.color("red");
		Window.out.rectangle(165, 150, 66, 100);*/
		//Stick figure lol
		Window.out.color("peach puff");
		Window.out.circle(100, 100, 10);
		Window.out.color("black");
		Window.out.circle(97, 97, 1);
		Window.out.color("black");
		Window.out.circle(103, 97, 1);
		Window.out.line(97, 103, 100, 104);
		Window.out.circle(103, 97, 1);
		Window.out.line(100, 104, 104, 103);
		Window.out.color("peach puff");
		Window.out.rectangle(100, 125, 50, 5);
		Window.out.color("grey");
		Window.out.rectangle(100, 135, 20, 50);
		Window.out.color("dark blue");
		Window.out.rectangle(100, 175, 20, 40);
		Window.out.color("black");
		Window.out.rectangle(100, 185, 5, 30);
		//x y width height
	}

}
