package w3day2;

public class Warmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int increment = 0; increment<=100; increment++) {
			if (increment%2==0||increment%3==0) {
				System.out.println(increment + " Yay!");
			} else{
				System.out.println(increment);
			}

		}

	}

}