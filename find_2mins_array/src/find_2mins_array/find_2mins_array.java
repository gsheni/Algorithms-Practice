package find_2mins_array;

public class find_2mins_array {
	public static void main(String[] args){
		//How to find min and second min in an array  
		int[] array = new int[]{3, 8};
		for(int i = 0; i < array.length ; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//find the smallest element
		//then find the element just bigger than this
		int[] array_copy = new int[array.length];
		System.arraycopy(array, 0, array_copy, 0, array.length);
		find(array_copy.length, array_copy);
	}
	public static void find(int size, int[] array){
		//for loop depends on size of array to runtime is O(N)
		int first_smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		for(int i = 0; i < size ; i++){
			if (array[i] <= first_smallest){
				second_smallest = first_smallest;
				first_smallest = array[i];
			}
			else if(array[i] <= second_smallest){
				second_smallest = array[i];
			}
		}
		System.out.println(first_smallest);
		System.out.println(second_smallest);
	}
}
