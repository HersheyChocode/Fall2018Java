package w3day1;
import java.util.Scanner;

import java.util.Scanner;
public class Warmup1 {
	public static void main(String[] args) {
		//While loop from 1 - 10
		
		/*int i = 0;
		while(i<=10) {
			
			System.out.print(i+", ");
			i += 1;
			
		}*/
		
		/*for (int j = 0; j<=10; j++) {
			System.out.println(j);
		}*/
		
		Scanner tempcheck = new Scanner(System.in);
		System.out.print("What temperature is it outside");
		int temp = tempcheck.nextInt();
		if (temp<=40) {
			System.out.println("You can go skiing, snowboarding, or sleding!");
		} else if (temp>=40&&temp<=60) {
			System.out.println("Go out for a nice cool jog!");
		} else if (temp>=60&&temp<=75) {
			System.out.println("It's good time to take a walk!");
		} else{
			System.out.println("It's pretty hot! Swim!");
		}
	}

}
