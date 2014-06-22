package longestPalindromes;

public class ExpandMethod {
	
	public static void main(String[] args){
		ExpandMethod e = new ExpandMethod();
		String s = "abb";

		System.out.println(e.longestPalindrome(s));
	}
	public String longestPalindrome(String s) {
        if (s.length()==0) return "";
        String longest = s.substring(0,1);
//        System.out.println("first: "+ longest);
        for (int i=0;i<s.length()-1;i++){
            String s1 = expandOneString(s,i,i);
//            System.out.println("s1: "+ s1);
            if (s1.length()>longest.length()) {
                longest = s1;
            }
            String s2 = expandOneString(s,i,i+1);
//            System.out.println("s2: "+s2);
            if (s2.length()>longest.length()) {
                longest = s2;
            }
        }
        return longest;
    }
    
    public String expandOneString(String s, int c1, int c2){
        int left = c1;
        int right = c2;
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
