package longestPalindromes;

import java.util.ArrayList;

public class longestCommonString {
	public static void main(String[] args){
		longestCommonString l =new longestCommonString();
		ArrayList<String> result = l.longestCommonSubstr("ababcaa", "babca");
		System.out.println(result.get(0));
	}
	
	public ArrayList<String> longestCommonSubstr(String s1,String s2){
		ArrayList<String> result = new ArrayList<String>();
		int length = 0;
//		ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
		int[][] m = new int[s1.length()][s2.length()];
		for (int i=0;i<s1.length();i++){
			for (int j=0;j<s2.length();j++){
				m[i][j] = 0;
			}
		}
		for (int i=0;i<s1.length();i++){
			for (int j=0;j<s2.length();j++){
				if (s1.charAt(i)==s2.charAt(j)){
					if (i==0||j==0){
						m[i][j] = 1;
					}
					else{
						m[i][j] = m[i-1][j-1]+1;
					}
					if (m[i][j]>length){
						length = m[i][j];
						result.clear();
						result.add(s1.substring(i-length+1, i+1));
					}
					else if (m[i][j]==length){
						result.add(s1.substring(i-length+1, i+1));
					}
				}
				else {
					m[i][j]=0;
				}
			}
		}
		return result;
		
		
	}
}
