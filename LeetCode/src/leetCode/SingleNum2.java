package leetCode;

public class SingleNum2 {
	public int singleNumber(int[] A){
		int[] bits = new int[32];
		int result = 0;
		for (int i=0;i<32;i++){
			for(int j=0;j<A.length;j++){
				if (((A[j]>>i)&1)==1){
					bits[i]++;
				}
			}
			result |= (bits[i]%3)<<i;
		}
		return result;
	}
}
