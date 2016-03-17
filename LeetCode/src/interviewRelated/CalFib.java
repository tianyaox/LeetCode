package interviewRelated;

import java.util.Arrays;

public class CalFib {
	public static void main(String[] args){
//		System.out.println(Arrays.toString(new CalFib().cal(5)));
		System.out.println(Integer.parseInt("-1"));
	}
	public int[] cal(int n){
		int[] res = new int[n];
		if (n>2){
			res[0] = 1;
			res[1] = 1;
		}
		int i = 2;
		while (i<n){
			res[i] = res[i-1]+res[i-2];
			i++;
		}
		return res;
	}
}
