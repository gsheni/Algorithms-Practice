package find_all_primes_1_to_N;

import java.util.Scanner;

public class find_all_primes_1_to_N {

	public static void main(String[] args) {
		//Write a function to find all primes between 1 to N
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); 
		find_primes(n);
	}
	
	public static void find_primes(int n){
		boolean Prime = true;		
		System.out.println(2);
		
		for(int i = 3; i < n ; i += 2){
			for(int j = 3; j < i; j += 2){
				if (i % j == 0){
					Prime = false;
					break;
				}
			}
			if (Prime){
				System.out.println(i);
			}
			else{
				Prime = true;
			}
		}
		
	}

}
