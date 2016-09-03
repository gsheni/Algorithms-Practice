package precise_sqrt;

import java.math.BigDecimal;
import java.util.Scanner;

public class precise_sqrt {

	public static void main(String[] args) {
		// Design a function to find the sqrt of a number, exact to 0.001
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = reader.nextInt(); 
		sqrt_lib(n);
		sqrt_nolib(n);

	}
	
	public static void sqrt_nolib(int input){
		//not using libraries
		//equation 
		//sqrt(n+1) = ( (sqrt(n) + (input / sqrt(n))) / 2 )
		//where sqrt(n) is first square root number which should be input number/2
		//where input is the input number
		
		double squareroot_n = 0;
		double squareroot_n_plus_1 = input / 2;
		
		while ( (squareroot_n - squareroot_n_plus_1) != 0){
			squareroot_n = squareroot_n_plus_1;
			squareroot_n_plus_1 = (squareroot_n + (input / squareroot_n)) / 2;
		}
		BigDecimal decimal = new BigDecimal(squareroot_n_plus_1);
		BigDecimal rounded = decimal.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("No Library rounded " + rounded);
		
	}
	
	public static void sqrt_lib(int input){
		//Using libraries
		double ans = Math.sqrt(input);
		BigDecimal decimal = new BigDecimal(ans);
		BigDecimal rounded = decimal.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("Actual Answer " + ans);
		System.out.println("Library rounded " + rounded);
	}

}
