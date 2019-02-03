package w11day1;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {5,6,7,8};
		for(int x = 0; x<myArr.length; x++) {
			System.out.print(myArr[x]+" ");
			}
		System.out.println("\n");
		swap(myArr, 0, 3);
		for(int x = 0; x<myArr.length; x++) {
			System.out.print(myArr[x]+" ");
			}
	}

	
	public static void swap(int[] arr, int i, int j) {
		int x = arr[j];
		int y = arr[i];
		arr[i]=x;
		arr[j]=y;
	}
}
//And I know there's no making this right, this right
//And I know there's no changing your mind, your mind
//But we both found each other tonight
//So if love is nothing more than just a waste of your time
//Waste it on me, waste it on me
//Tell me why not waste it on me, waste in on me
//Oh baby why not waste it on me, waste in on me