package leetCode2016;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args){
		System.out.println(Arrays.toString(twoSumFaster(new int[]{1,2,3}, 3)));
	}
	
	public static int[] twoSum(int[] nums, int target){
		int[] result = new int[2];
		for (int i = 0; i < nums.length-1; i++){
			for (int j = i+1; j<nums.length; j++){
				if (nums[i] + nums[j] == target){
					result = new int[]{i,j};
					return result;
				}
			}
		}
		return result;
		
	}
	
	public static int[] twoSumFaster(int[] nums, int target){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
		int[] result = new int[2];
		for (int i=0;i<nums.length;i++){
			if (!hm.containsKey(target-nums[i])){
				hm.put(nums[i], i);
			}
			else{
				
				result[0] = hm.get(target-nums[i]);
				result[1] = i;
				break;
			}
		
		}
		return result;
		
	}
}
