package anagrams_check_two_strings;

import java.util.Arrays;
import java.util.HashMap;

public class anagrams_check_two_strings {

	public static void main(String[] args) {
		/*
		 * Check if two strings (words) are anagrams
		 * Assuming same length, and same letter case
		 * finished
		 */
		String str1 = new String("iceman");
		String str2 = new String("cinema");
		
		/* 
		 * Solution Runtime = O(n log n) b/c of Arrays.sort method
		 * Space Complexity = O(n) b/c char array stored.
		 */
		sorting(str1, str2);
		
		/* 
		 * Solution Runtime = O(n) b/c of insertion, deletion in hashmap
		 * Space Complexity = O(n) b/c using hashmap
		 */
		hashing(str1, str2);
		
		/* 
		 * Solution Runtime = O(n) b/c of for loop to iterate through string
		 * Space Complexity = O(1) b/c constant int[26]
		 */
		array(str1, str2);
	}
	public static void sorting(String str1, String str2){
		char[] str1_char = str1.toLowerCase().toCharArray();
		char[] str2_char = str2.toLowerCase().toCharArray();
		Arrays.sort(str1_char);
		Arrays.sort(str2_char);
		for(int i = 0; i < str1.length() ; i++){
			if(str1_char[i] != str2_char[i]){
				System.out.println("sorting - Not Anagram");
				return;
			}
		}
		System.out.println("sorting - Anagram");
	}
	
	public static void hashing(String str1, String str2){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i< str1.length(); i++){
			if(map.containsKey(str1.charAt(i))){
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			}
			else{
				map.put(str1.charAt(i), 1);
			}
		}
		for(int i = 0; i< str2.length(); i++){
			if(map.containsKey(str2.charAt(i))){
				if(map.get(str2.charAt(i)) < 2){
					//only 1 left, so remove it. 
					map.remove(str2.charAt(i));
				}
				else{
					map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
				}
			}
			else{
				System.out.println("hashing - Not Anagram");
				return;
			}
		}
		if(map.isEmpty()){
			System.out.println("hashing - Anagram");
		}
		else{
			System.out.println("hashing - Not Anagram");
		}
		return;
	}
	
	public static void array(String str1, String str2){
		int[] array = new int[26];
		for(int i = 0; i< str1.length(); i++){
			array[str1.charAt(i)-'a']++;
		}
		for(int i = 0; i< str2.length(); i++){
			array[str2.charAt(i)-'a']--;
		}
		for(int i = 0; i< str2.length(); i++){
			if(array[i] != 0){
				System.out.println("array - Not Anagram");
				return;
			}
		}
		System.out.println("array -  Anagram");
		return;
	}
}
