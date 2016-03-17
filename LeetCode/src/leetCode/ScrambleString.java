package leetCode;

public class ScrambleString {
	
	public static void main(String[] args){
		String s1 = "ab";
		String s2 = "ba";
		System.out.println(isScramble(s1,s2));
	}
	public static boolean isScramble(String s1, String s2) {
		if (s1.equals(s2)) {
			return true;
		}

		if (s1.length() != s2.length()) {
			return false;
		}

		int[] chars = new int[26];
		int len = s1.length();
		for (int i = 0; i < len; i++) {
			chars[s1.charAt(i) - 'a']++;
			chars[s2.charAt(i) - 'a']--;
		}
		System.out.println(1);
		for (int i : chars) {
			if (i != 0) {
				return false;
			}
		}
		System.out.println(2);

		for (int i = 1; i < len; i++) {
			String s11 = s1.substring(0, i);
			String s12 = s1.substring(i, len);
			String s21 = s2.substring(0, i);
			String s22 = s2.substring(i, len);
			
			System.out.println(s11);
			System.out.println(s12);
			System.out.println(s21);
			System.out.println(s22);

			if (isScramble(s11, s21) && isScramble(s12, s22)) {
				return true;
			}

			s21 = s2.substring(len - i,len);
			s22 = s2.substring(0,len - i);
			
			System.out.println(s21);
			System.out.println(s22);
			
			if (isScramble(s11, s21) && isScramble(s12, s22)) {
				return true;
			}
		}
		return false;
	}
}
