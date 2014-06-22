package interviewRelated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class SortBasedOnAnagram {
	public static void main(String[] args){
		String[] s = {"cat", "star", "act", "god", "arts", "dog", "rats"};
		System.out.print(sort(s).toString());
//		String s1 = "cab";
//		System.out.print(strSort(s1));
	}
	
	public static ArrayList<ArrayList<String>> sort(String[] sArr) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>(); 
		Map<String, ArrayList<String>> wordPool = new HashMap<String, ArrayList<String>>();
		for (String s : sArr) {
			String newS = strSort(s);
			System.out.println(newS);
			if (wordPool.containsKey(newS)) {
				wordPool.get(newS).add(s);
				System.out.println("old key");
			} else {
				ArrayList<String> newPool = new ArrayList<String>();
				newPool.add(s);
				wordPool.put(newS, newPool);
			}
		}
		for (Map.Entry<String, ArrayList<String>> entry : wordPool.entrySet()) {
			ArrayList<String> words = entry.getValue();
			result.add(words);
		}
		return result;

	}

	public static String strSort(String s) {
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
}
