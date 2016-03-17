package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak2 {
	
	public static void main(String[] args){
		Set<String> mySet = new HashSet<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		System.out.print(wordBreak("catsanddog",mySet).toString());
//		int[] a = new int[32];
	}
	public static List<String> wordBreak(String s, Set<String> dict){
//		single word
		String result = "";
		List<String> solution = new ArrayList<String>();
		int len = s.length();
//		helper
		Boolean[] a =new Boolean[s.length()+1];
		Arrays.fill(a,true);
		List<Boolean> possible = new ArrayList<Boolean>(Arrays.asList(a));
		
		getAllSolutions(s, dict, 0, result, len, solution, possible);
		return solution;
	}
	public static void getAllSolutions(String s, Set<String> dict, int start,String result, int len, List<String> solution, List<Boolean> possible){
		if (start==len){
			solution.add(result.substring(0,result.length()-1));
			return;
		}
		
		for (int i=start;i<len;i++){
			String curS = s.substring(start,i);
			if (dict.contains(curS) && possible.get(i+1)){
				String temp = result;
				result+=(curS+" ");
				int sizeBeforeChange = solution.size();
				getAllSolutions(s,dict,i+1,result,len,solution,possible);
				if (solution.size()==sizeBeforeChange){
					possible.add(i+1,false);
				}
				result = temp;
			}
		}
	}
}
