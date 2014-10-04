package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColor {
	public static void main(String[] args){
		int[] a = new int[]{1,2,0,1,1,2,1,2,0,0,2,1,2};
		sortcolor(a);
		System.out.print(Arrays.toString(a));
	}
	
	public static void sortcolor(int[] a){
		ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>(3);
		ArrayList<Integer> red = new ArrayList<Integer>();
		ArrayList<Integer> blue = new ArrayList<Integer>();
		ArrayList<Integer> white = new ArrayList<Integer>();
		bucket.add(0, red);
		bucket.add(1, blue);
		bucket.add(2, white);
		for (int i=0;i<a.length;i++){
			bucket.get(a[i]).add(a[i]);
		}
		int index = 0;
		for (int i=0;i<bucket.size();i++){
			for (int j=0;j<bucket.get(i).size();j++){
				a[index] = bucket.get(i).get(j);
				index++;
			}
		}
	}
}
