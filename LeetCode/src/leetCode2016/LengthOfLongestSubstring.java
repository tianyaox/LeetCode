package leetCode2016;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	public static void main(String[] args){
		System.out.println(lengthOfLongestSubstring(""));
		
	}
	
	public static int lengthOfLongestSubstring(String s){
		// do not use s==""
		if (s.isEmpty()){return 0;}
		int p1 = 0, p2 = 0;
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		int longest = 1;
		while (p1<s.length() && p2<s.length()){
			char c = s.charAt(p2);
			if (hm.containsKey(c)){
				if (p1<=hm.get(c)){
					p1 = hm.get(c)+1;
				}
			}
			hm.put(c, p2);
			// don't forget only to update when longer!!!
			if (p2-p1+1>longest){
				longest = p2 - p1 +1;
			}
			// don't forget to update index as the last step!!!
			p2++;
		}
		return longest;
	}
}
