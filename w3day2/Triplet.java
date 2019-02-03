package w3day2;

public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1; a<=500; a++) {
			for (int b=1; b<=500; b++) {
				for (int c=1; c<=500; c++) {
					if (a*a+b*b==c*c) {
						if (a+b+c==1000){
							System.out.println(a*b*c);
						}
					}
				}
			}
		}
	}

}
