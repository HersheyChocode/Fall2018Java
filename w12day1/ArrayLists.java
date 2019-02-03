package w12day1;

import java.util.ArrayList;
import apcs.Window;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>nums = getRandomIntList();
		for (int i = 0; i<nums.size(); i++) {
			System.out.print(nums.get(i)+" ");
		}
		System.out.print("\n");
		swap(nums, 0,1);
		for (int i = 0; i<nums.size(); i++) {
			System.out.print(nums.get(i)+" ");
		}
		System.out.print("\n");
		for (int i = 0; i<nums.size(); i++) {
			if(nums.get(i)<0) {
			System.out.print(nums.get(i)+" ");
			}
		}
	
	}
	
	public static ArrayList<Integer>getRandomIntList() {
		ArrayList<Integer>randomInts = new ArrayList<Integer>();
		for(int i  = 0; i<101; i++) {
			randomInts.add(Window.random(-100, 100));
		}
		return randomInts;
	}
	
	public static void swap(ArrayList<Integer>list, int i, int j){
		int x = list.get(j);
		list.set(j, list.get(i));
		list.set(i, x);
	}

}