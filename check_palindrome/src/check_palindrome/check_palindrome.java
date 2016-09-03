package check_palindrome;

public class check_palindrome {
	/*
	 * Write an efficient function that checks whether any permutation of an input string is a palindrome .
	 * "civic" should return true
	 * "ivicc" should return true - "if any permutation of the string is a palindrome."
	 * "civil" should return false
	 * "livci" should return false
	 */
	public static void main(String[] args) {
		String[] words = new String[]{"civic","ivicc", "civil", "livci"};
		simple_check_palindrome(words, words.length);
		
	}
	
	public static void simple_check_palindrome(String[] words, int n){
		for(int k = 0; k < n ;k++){
			String input = words[k];
	        int i = 0;
	        int j = input.length() - 1;
	        while (i < j && input.charAt(i) == input.charAt(j)) {
	            i++;
	            j--;
	        }
	        if (i < j) {
	            System.out.println("No");
	        } else {
	            System.out.println("Yes");
	        }
		}
	}
	public static void permutation_check_palindrome(String[] words, int n){
		
	}

}
