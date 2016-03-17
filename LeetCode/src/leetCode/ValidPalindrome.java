package leetCode;

public class ValidPalindrome {
	public boolean isPalindrome(String s){
		if (s==null || s.isEmpty() || s.replaceAll("\\s+", "").isEmpty()){
			return true;
		}
		int i = 0;
		int j = s.length()-1;
		s = s.toLowerCase();
		while (i<=j){
			while (!(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i)))){
				i++;
				if (i>j||i>=s.length()){
					return false;
				}
				
			}
			while (!Character.isLetter(s.charAt(j))||Character.isDigit(s.charAt(j))){
				j--;
				if (i>j||j<0){
					return false;
				}
			}
			if (s.charAt(i)!=s.charAt(j)){
				return false;
			}
			else{
				continue;
			}
		}
		return true;
	}
}
