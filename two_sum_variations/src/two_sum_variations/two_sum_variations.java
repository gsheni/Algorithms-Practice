package two_sum_variations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class two_sum_variations {
	/*
	 * 2-Sum: Given a sorted array, write a program to decide if two elements sum up to a third
	 * Finished.
	 */
	public static void main(String[] args){
		int[] sorted_arry = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] sorted_arry = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10};
		int sum = 9;
		System.out.println(Arrays.toString(sorted_arry));

		/* Solution Runtime = O(n^2) b/c of making sums
		 * Space Complexity = O(n) to store hashmap
		 */
		not_given_sum(sorted_arry);
		
		/* Solution Runtime = O(nlogn)
		 * Space Complexity = O(1) b/c don't really create anything besides a temp_sum variable.
		 */
		given_sum(sorted_arry, sum);
		
		int[] arry2 = new int[]{1, 4, 45, 6, 10, -8};
		int sum2 = 16;
		/* Solution Runtime = O(n) b/c insertion
		 * Space Complexity = O(n) to store the hashset
		 */
		better_given_sum(arry2, sum2);
	}
	
	public static void better_given_sum(int[] arry, int sum){
		System.out.println("\nBetter_Given_Sum - " + sum);
		HashSet<Integer> map = new HashSet<Integer>();
		//insert all elements into hashmap, O(n)
		for(int i = 0; i < arry.length; i++){
			int temp = sum - arry[i];
			if(temp > 0 && map.contains(temp)){
				System.out.println("Pair with given sum " +
                        sum + " is (" + arry[i] +
                        ", "+temp+")");
			}
			map.add(arry[i]);
		}
	}
	public static void given_sum(int[] arry, int sum){
		System.out.println("\nGiven_Sum - " + sum);
		if(arry == null || arry.length < 3){
			System.exit(0);
		}
		int low_index = 0;
		int high_index = arry.length-1;
		while(low_index < high_index ){
			int temp_sum = arry[low_index] + arry[high_index];
			if (temp_sum  == sum){
				System.out.println(sum +" = " + arry[low_index] + " + " + arry[high_index]);
				//handle duplicates
				low_index++;
				high_index--;
			}
			if (temp_sum < sum){
				low_index++;
			}
			else if(temp_sum > sum){
				high_index--;
			}
		}
		return;
	}
	
	public static void not_given_sum(int[] arry){
		System.out.println("Not_Given_Sum");

		if(arry == null || arry.length < 3){
			System.exit(0);
		}
		//determine every possible sum
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for(int i = 0; i < arry.length; i++){
			for(int k = 0; k < arry.length; k++){
				if( i != k){
					int sum = arry[i] + arry[k];
					if(!map.containsKey(sum)){
						List<Integer> values = new ArrayList<Integer>();
						values.add(i);
						values.add(k);
						map.put(sum, values);
					}
				}
			}
		}
		//show sums
		for(Object objname:map.keySet()) {
			   System.out.print(objname + " = " );
			   List<Integer> indices = map.get(objname);
			   for(int j : indices){
				   System.out.print(arry[j] +" ");
			   }
			   System.out.println();
		}
		
		//find if the element exists in the hashmap
			//if it does, print out the elements making it up
		for(int i = 0; i < arry.length; i++){
			if(map.containsKey(arry[i])){
				List<Integer> indices = map.get(arry[i]);
				System.out.print(arry[i] + " = ");
				for(int j : indices){
					System.out.print(arry[j] + " ");
				}
				System.out.println();
			}
		}
	}
}
