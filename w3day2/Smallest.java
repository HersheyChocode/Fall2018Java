package w3day2;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2520;
		int j = 0;
		while (j==0) {
			if (i%20==0&&i%18==0&&i%16==0&&i%14==0&&i%11==0&&i%13==0&&i%17==0&&i%19==0) {
				System.out.println(i);
				j = 1;
			}
			i++;
		}
	}

}
