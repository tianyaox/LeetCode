package interviewRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortBasedOnAnagram2 {
//	public static ArrayList<String> sort(String[] sArr){
//		return Arrays.asList(Arrays.sort(sArr,new SortBasedOnAnagram2.new MyComparator()));
//	}
	
	public class MyComparator implements Comparator<String>{
		public String sortString(String s){
			char[] cArr = s.toCharArray();
			Arrays.sort(cArr);
			return new String(cArr);
		}
		@Override
		public int compare(String s1,String s2) {
			return sortString(s1).compareTo(sortString(s2));
		}
		
		
	}
}