package leetCode;

import java.util.Arrays;

public class NextPermutation {
	public static void main(String[] args){
		int[] num = {5,4,7,5,3,2};
		nextPermutation(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void nextPermutation(int[] num) {
        if (num==null || num.length<2) return;
        int leftChangeIndex = num.length-1;
        int leftChange = num[leftChangeIndex];
        
        boolean success = false;
        // find the first not acsending from backward
        for (int i = num.length-2; i>=0; i--){
            int curNum = num[i];
            if (curNum<leftChange){
                leftChange = curNum;
                leftChangeIndex = i;
                success = true;
                break;
            }
            leftChangeIndex = i;
            leftChange = num[leftChangeIndex];
        }
        if (!success) {
            reverse(num,0,num.length-1);
            return;
        }
        // find the first to be larger than left change
        int rightChangeIndex=num.length-1;
        int rightChange=num[rightChangeIndex];
        for (int i = num.length-1;i>=0;i--){
            int curNum = num[i];
            if (curNum>leftChange){
                rightChangeIndex = i;
                rightChange = curNum;
                break;
            }
        }
        System.out.println("leftIndex: "+leftChangeIndex);
        System.out.println("rightIndex: "+rightChangeIndex);
        num[leftChangeIndex] = rightChange;
        num[rightChangeIndex] = leftChange;
        System.out.println("BeforeReverse: "+Arrays.toString(num));
        reverse(num,leftChangeIndex+1,num.length-1);
        return;
    }
    
    public static void reverse(int[] num,int left,int right){
        int end = right;
        for (int i=left;i<left+(right+1-left)/2;i++){
            int temp = num[i];
            num[i] = num[end];
            num[end] = temp;
            end--;
        }
        return;
    }
}
