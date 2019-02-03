package w13day1;
import apcs.*;
public class Warmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[5][6];
		for(int i =0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = Window.random(-100, 100);
				System.out.print(mat[i][j] + " ");
			}
		}
		
		changeNegs(mat);
		System.out.println();
		for(int[]array : mat) {
			for(int element : array) {
				System.out.print(element + " ");
			}
		}

	}

	public static void changeNegs(int[][]mat) {
		for(int i =0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j]<0) {
					mat[i][j] = 0;
				}
			}
		}
	}

}
