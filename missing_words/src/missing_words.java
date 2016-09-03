
public class missing_words {
	/*
	 * Time-complexity = O(n).
	 * Auxiliary space complexity = O(1).
	 */
	public static void main(String[] args) {
		// Prints the missing words from the original array along with their indices.
		String sentence1 = "Hackerrank is a great programming and a learning tool.";
		String sentence2 = "Hackerrank great and learning tool for what not and fun.";
		findMissingWords(sentence1, sentence2);
	}
	public static void findMissingWords(String sentence1, String sentence2){
		String[] array1 = sentence1.replace(".", " ").split(" ");
		String[] array2 = sentence2.replace(".", " ").split(" ");
		
		int i = 0;
		int j = 0;
		while (i < array1.length && j < array2.length ){
			if (array1[i].equals(array2[j])){
				//word is not missing, so increment and move to next word
				i++;
				j++;
			}
			else{
				//word is missing from original in the second array, so print it out
				System.out.println(array1[i]+" : " +(i+1));
				i++;
			}
		}
	}
}
