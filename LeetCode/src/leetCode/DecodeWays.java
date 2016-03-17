package leetCode;

public class DecodeWays {
	public static void main(String[] args){
		System.out.println(new DecodeWays().numDecodings("01"));
	}
	
	public int numDecodings(String s){
		int res = 0;
		if (s==null || s.isEmpty()){
			return res;
		}
		if (s.charAt(0)-48 == 0){
			return 0;
		}
		res = 1;
		for (int i=1;i<s.length();i++){
			if (s.charAt(i)-48 <= 6 && s.charAt(i)-48 >0  && s.charAt(i-1)-48<=2 && s.charAt(i-1)-48>0){
				res++;
			}
		}
		return res;
	}
	
}
