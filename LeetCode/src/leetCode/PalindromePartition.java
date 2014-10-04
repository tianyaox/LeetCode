package leetCode;
import java.util.*;
public class PalindromePartition {
    public List<List<String>> partition(String s) {
        List<String> oneResult = new ArrayList<String>();
        List<List<String>> solution = new ArrayList<List<String>>();
        DFS(s,0,oneResult,solution);
        return solution;
        
    }
    public void DFS(String s, int start, List<String> oneResult, List<List<String>> solution){
        if (start==s.length()){
            solution.add(oneResult);
            return;
        }
        for (int i=start;i<s.length();i++){
            if (isPalindrome(s,start,i)){
                oneResult.add(s.substring(start,i+1));
                DFS(s,start+1,oneResult,solution);
                oneResult.remove(oneResult.size()-1);
            }
        }
        
    }
    
    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }
}
