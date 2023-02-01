package javacode;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		String rev = "";
		
		Boolean ans = false;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args) {
		String str1 = "abba";
		String str2 ="example";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		boolean A = isPalindrome(str1);
		boolean B = isPalindrome(str2);
		System.out.println(A);
		System.out.println(B);

	}

}
