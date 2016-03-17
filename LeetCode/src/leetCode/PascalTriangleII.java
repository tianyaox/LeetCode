package leetCode;

import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {
	
	public static void main(String[] args){
		System.out.print(new PascalTriangleII().getRow(4).toString());
	}
	public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex+1];
        result[0] = 1;
        for (int i=1;i<rowIndex+1;i++){
            int lastTemp = 0,tempForNext=0;
            for (int j=0;j<i+1;j++){
            	if (j==i){
            		result[j] = j-1<0?0:lastTemp;
            		continue;
            	}
                tempForNext = result[j];
                result[j] = (j-1<0?0:lastTemp)+(j>i-1?0:result[j]);
                lastTemp = tempForNext;
            }
        }

        return Arrays.asList(result);
    }
}
