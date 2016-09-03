package string_to_int;

public class string_to_int {
	public static void main(String[] args) {
	 System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
     System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
     System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
	}
	public static int convert_String_To_Number(String input){
		char[] ch = input.toCharArray();
		int sum = 0;
		int zero = (int)'0';
		for(char c:ch){
			int temp = (int) c;
			sum = (sum*10) + (temp-zero);
		}
		return sum;
	}
}
