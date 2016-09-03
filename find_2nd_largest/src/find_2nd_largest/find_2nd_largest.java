package find_2nd_largest;

import java.util.Arrays;

public class find_2nd_largest {

	public static void main(String[] args) {
		/*
		 * Find the 2nd largest element in an array
		 * Finished
		 */
		int[] array = new int[]{3, 8, 1, 0, 4, 9, 1, 3, 6, 8, 5, 10};
		int length = array.length;
		
		/* 
		 * Solution Runtime = O(n) b/c going through array once
		 * Space Complexity = O(1) b/c nothing really stored
		 */
		single_loop(array, length);
		
		/* Solution Runtime = O(n log n) b/c of Arrays.sort method
		 * Space Complexity = O(1) b/c nothing really stored. 
		 */
		sorting(array, length);
		
	}
	
	public static void single_loop(int[] array, int length){
		int max = -1;
		int secondMax = -1;
		for(int i = 0; i < length ; i++){
			if(array[i] > secondMax){
				if(array[i] > max){
					secondMax = max;
					max = array[i];
				}
				else{
					secondMax = array[i];
				}
			}
		}
		System.out.println("single_loop - SecondMax " + secondMax);
	}
	
	public static void sorting(int[] array, int length){
		//documentation says runtime of sorting is nlogn
		Arrays.sort(array);
		System.out.println("sorting - SecondMax " + array[length-2]);
	}
}
