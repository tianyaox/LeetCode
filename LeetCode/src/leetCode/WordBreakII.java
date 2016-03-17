package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakII {
	public static void main(String[] args){
		String[] elements = {"cat", "cats", "and", "sand", "dog"};
		Set<String> dict = new HashSet<String>(Arrays.asList(elements));
		String s = "catsanddog";
		System.out.println(new WordBreakII().wordBreak(s,dict));
	}
	public List<String> wordBreak(String s, Set<String> dict){
		List<String> result = new ArrayList<String>();
		if (s==null||s.length()==0){
			return result;
		}
		getRes(s,dict,result,0,"");
		return result;
	}
	public void getRes(String s, Set<String> dict, List<String> result, int start, String curS){
		if (start == s.length()){
			result.add(curS);
			return;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=start;i<s.length();i++){
			sb.append(s.charAt(i));
			if (dict.contains(sb.toString())){
				String newS = "";
				if (curS.length()==0){
					newS = sb.toString();
				}
				else{
					newS = curS+" "+sb.toString();
				}
				getRes(s, dict, result, i+1, newS);
			}
		}
	}
}
