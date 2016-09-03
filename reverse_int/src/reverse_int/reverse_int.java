package reverse_int;

public class reverse_int {

	public static void main(String[] args) {
		int input = 4351;
        int result = 0;
        while( input > 0 ) {
        	//remainder by 10 will give you ones digit
        	//multiple by 10 will keep the previous digit
        	result = result*10 + input%10;
        	//remove the last digit just found
            input = input/10;
        }
        System.out.println(result);
    }
}
