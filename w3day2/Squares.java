package w3day2;

public class Squares {

	public static void main(String[] args) {
		
		int sumSquare = 0;
		int sumEighty = 0;

		// TODO Auto-generated method stub
		for (int i=1; i<=80; i++) {
			sumSquare += i*i;
			sumEighty += i;
		}

		int difference = sumEighty*sumEighty - sumSquare;
		System.out.println(difference);


	}

}