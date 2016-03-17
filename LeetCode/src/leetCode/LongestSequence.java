package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSequence {
	public int longestConsecutive(int[] num){
		int result = 0;
		if (num==null || num.length==0){
			return result;
		}
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for (int i=0;i<num.length;i++){
			m.put(num[i], i);
		}
		Integer[] a = new Integer[num.length];
		Arrays.fill(a, 0);
		List<Integer> visited = new ArrayList<Integer>(Arrays.asList(a));
		for (int i=0;i<num.length;i++){
			if (visited.get(i)==1){
				continue;
			}
			visited.add(i, 1);
			int len = 1;
			int index = num[i]-1;
			while (m.containsKey(index)){
				visited.add(m.get(index),1);
				m.remove(index);
				index--;
				len++;
			}
			index = num[i]+1;
			while (m.containsKey(index)){
				visited.add(m.get(index),1);
				m.remove(index);
				index++;
				len++;
			}
			if (len>result){
				result = len;
			}
			
			
		}
		return result;
	}
}
