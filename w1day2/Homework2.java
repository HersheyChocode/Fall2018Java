package w1day2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in); 
		System.out.println("Please type your height in feet and inches: ");
		int femaleHeight = my_scanner.nextInt();
		int femaleFeet = femaleHeight/10;
		int femaleInches = femaleHeight-50;
		int femaleIdealWeight = 100+((femaleInches+(femaleFeet-5)*2)*5);
		System.out.println(femaleIdealWeight);
		System.out.println("Please type your height in feet and inches: ");
		int maleHeight = my_scanner.nextInt();
		int maleFeet = maleHeight/10;
		int maleInches = maleHeight-50;
		int maleIdealWeight = 106+((maleInches+(maleFeet-5)*2)*6);
		System.out.println(maleIdealWeight);
	}

}
