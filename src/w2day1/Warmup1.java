package w2day1;

import java.util.Scanner;

public class Warmup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates new Scanner
		Scanner my_scanner = new Scanner(System.in);
		//Gets the input from user
		System.out.println("What radius would you like");
		int rad = my_scanner.nextInt();
		
		//Finds circumfrence and area
		double circ = 2*rad*3.14;
		
		//Finds area of the circle
		double area = 3.14*rad*rad;
		
		//Prints
		System.out.println("Circumfrence "+circ+"\nArea "+area);
		

	}

}
