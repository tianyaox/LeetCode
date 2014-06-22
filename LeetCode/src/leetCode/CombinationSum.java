package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
	public static void main(String[] args){
		int[] candidates = new int[]{1,2};
		int target = 3; 
		System.out.println(Arrays.toString((combinationSum(candidates,target)).toArray()));
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<Integer> s = new Stack<Integer>();
        combinationSum(candidates, target, 0, s, result);
        return result;
    }
    
    private static void combinationSum(int[] candidates, int target, int start, Stack<Integer> path, List<List<Integer>> result){
        if (target==0){
            List<Integer> list = new ArrayList<Integer>();
            list.addAll(path);

            result.add(list);
            return;
        }
        for (int i=start;i<candidates.length;i++){
            if (candidates[i]>target){
                return;
            }
            path.push(candidates[i]);
            System.out.println("target"+target);
            System.out.println("candidate"+candidates[i]);
            System.out.println("i"+i);
            combinationSum(candidates,target-candidates[i],i,path,result);
            path.pop();
        }
        
    }
}
