package w3day2;

import apcs.Window;
import java.util.Scanner;

public class Warmup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randnum = Window.random(0, 100); //random num
		
		Scanner my_scanner = new Scanner(System.in); //Creates scanner
		int guess = 0; //Creates initial guess 
		int increment = 0; //Creates increment
		System.out.println("Pick a number from 1 - 100: ");//Asks user
		while (guess!=randnum && increment <=10) {
			guess = my_scanner.nextInt();
			if (guess<randnum) {
				System.out.println("It's a little too low... Try a number higher: ");
			} else if (guess>randnum) {
				System.out.println("It's a little too high... Try a number lower: ");
			} else if (guess==randnum) {
				System.out.println("Congratulations! You won!");
			}
			
			increment++;
		}
		
		
		

	}

}
