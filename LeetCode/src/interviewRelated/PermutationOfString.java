package interviewRelated;

import java.util.ArrayList;


public class PermutationOfString {
	public static void main(String[] args){
		String s = "123";
		System.out.println(perm(s).toString());
		int[] a = {1,2,3};
		
	}
	public static ArrayList<String> perm(String s){
		ArrayList<String> newPerms = new ArrayList<String>();
		if (s==null || s.length()==0){
			return newPerms;
		}
		if (s.length()==1){
			newPerms.add(s);
			return newPerms;
		}
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		ArrayList<String> restPerms = perm(rest);
		
		for (int i=0;i<restPerms.size();i++){
			String curStr = restPerms.get(i);
			for (int j=0;j<=curStr.length();j++){
				String newStr = insert(j,first,curStr);
				newPerms.add(newStr);
			}
		}
		return newPerms;
	}
	
	public static String insert(int i,String inserted, String original){
		StringBuffer s = new StringBuffer(original);
		s.insert(i, inserted);
		return s.toString();
	}
	
}
