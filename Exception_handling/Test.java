package Exception_handling;

import java.util.zip.DataFormatException;

public class Test {
	
	    
	    public static void main(String[] args) {
	        int a = 5;
	        int b = 0;
	        int[] arr = {1, 2, 3};
	        try {
	            // Attempt to divide by zero
	            int result = a / b;
	        } catch (ArithmeticException e) {
	            System.out.println("Invalid division");
	        }
	        
	        try {
	            // Attempt to parse a string to an integer
	            String str = "abc";
	            int num = Integer.parseInt(str);
	        } catch (NumberFormatException e) {
	            System.out.println("Format mismatch");
	        }
	        
	        try {
	            // Attempt to access an invalid calculation
	            int result = arr[3] + a;
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is invalid");
	        } catch (Exception e) {
	            System.out.println("Calculation invalid");
	        }
	        
	        System.out.println("Exception Handling Completed");
	    }
	}
