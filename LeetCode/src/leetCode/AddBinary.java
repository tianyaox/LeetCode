package leetCode;

public class AddBinary {
	public static void main(String[] args){
		System.out.println(addBinary("11","1"));
	}
	
	
	public static String addBinary(String a, String b){
		if (a==null || a.length()==0){
			return b;
		}
		if (b==null || b.length()==0){
			return a;
		}
		StringBuffer sb = new StringBuffer();
		
		int lastIndexA = a.length()-1;
		int lastIndexB = b.length()-1;
		int carry = 0;
		
		while (lastIndexA>=0||lastIndexB>=0||carry>0){
			int intA = lastIndexA>=0?a.charAt(lastIndexA)-'0':0;
			int intB = lastIndexB>=0?b.charAt(lastIndexB)-'0':0;
			int thisDigit = (intA+intB+carry)%2;
			carry = (intA+intB+carry)/2;
			
			
			sb.insert(0, thisDigit);
			
			lastIndexA--;
			lastIndexB--;
		}
		
		return sb.toString();
	}
}
