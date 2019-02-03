package w1day2;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = my_scanner.nextLine();
		
		System.out.println(name);

	}

}
