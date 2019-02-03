package w1day2;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Building the scanner machine
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.print("Please enter your integer: ");
		double int1 = my_scanner.nextInt();
		
		System.out.print("Please enter your integer: ");
		double int2 = my_scanner.nextInt();
		
		System.out.print("Please enter your integer: ");
		double int3 = my_scanner.nextInt();
		
		System.out.print("Please enter your integer: ");
		double int4 = my_scanner.nextInt();
		
		double average_value = (int1+int2+int3+int4)/4;
		
		System.out.println("The average value is " + average_value);

	}

}
