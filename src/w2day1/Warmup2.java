package w2day1;

import java.util.Scanner;

public class Warmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates new Scanner
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("What width do you like? ");
		int width = my_scanner.nextInt();
		System.out.println("What height do you like? ");
		int height = my_scanner.nextInt();
		System.out.println("What length do you like? ");
		int length = my_scanner.nextInt();
		
		int paint = length*width*height;
		
		System.out.println("You will need"+paint+"units to paint the room.");
				

	}

}
