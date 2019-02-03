package w2day2;
import java.util.Scanner;
public class Warmup1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int input = my_scanner.nextInt();
		
		if (input>5||input<15) {
			System.out.println("Yay!");
		} else if (input>15) {
			System.out.println("Nay");
		}
		
		System.out.println("Enter a value a: ");
		int a = my_scanner.nextInt();
		System.out.println("Enter a value b: ");
		int b = my_scanner.nextInt();
		
		if (a==10||b==10||a+b==10) {
			System.out.println("Yay!");
		} else if ((a<0&&b>0)||b<0&&a>0) {
			System.out.println("Yay!");
		}
		
		System.out.println("Enter a value n: ");
		int n = my_scanner.nextInt();
		
		if(n>100&&n<200) {
			System.out.println("Yay!");
		} else {
			System.out.println("Nay");
		}

	}

}