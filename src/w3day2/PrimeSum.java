package w3day2;

//import static java.lang.Math.sqrt;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime = 0;
		int sumInt = 1;
		for(int i = 2; i <=1000; i++) {
			sumInt = 1;
			//for (double j = 2; j<=Math.sqrt(i); j++) {
			for (int j = 2; j<i; j++) {	
				if (i%j==0) {
					sumInt = 0;
				}
			}
			if (sumInt==1) {
				prime = prime + i;
			}
				
			}
		System.out.println(prime);
			
		}

	}


