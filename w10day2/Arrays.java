package w10day2;
import java.util.Random;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[10000];
		Random rand = new Random();
		for(int i=0; i<= myArray.length-1; i++) {
			myArray[i]= rand.nextInt(100);
		}
		int sum = 0;
		int largest = 0;
		for(int i=0; i<= myArray.length-1; i++) {
			sum += myArray[i];
			if(myArray[i]>largest) {
				largest = myArray[i];
			}
		}
		System.out.println(sum+"\n"+largest);

	}

}