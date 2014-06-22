package leetCode;
import java.util.ArrayList;
import java.util.Arrays;

public class Permute {
    public static void main(String[] args){
    	int[] num = {0,1};
    	System.out.print((permute(num).toString()));
    }
	public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(num.equals(null) || num.length==0){
            return result;
        }
        if (num.length==1){
            ArrayList<Integer> r = new ArrayList<Integer>();
            r.add(num[0]);
            result.add(r);
            return result;
        }
        Integer first = num[0];
        int[] rest = Arrays.copyOfRange(num,1,num.length);
        ArrayList<ArrayList<Integer>> restPerm = permute(rest);
        
        for (int i=0;i<restPerm.size();i++){
            ArrayList<Integer> curPerm = restPerm.get(i);
            
            for (int j=0;j<=curPerm.size();j++){
                ArrayList<Integer> newPerm = new ArrayList<Integer>(curPerm);
                newPerm.add(j,first);
                result.add(newPerm);
            }
        }
        return result;
    }
}
