package Exception_handling;
import java.util.Scanner;
public class test_2 {
	public static void main(String[] args) {	      
		try {
			int i= 50/0;//Arithmetic exception
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
			try{// null pointer Exception
			String s= null;
			//after exception can't excute the other lines
			System.out.println(s.length());}
			catch(Exception e) {
				System.out.println(e);
			}
			
			// ArrayIndexoutBound Exception
			try{int arr[]= new int[5];
			arr[7]=10;}
			catch(Exception e) {
				System.out.println(e);
			}
			
			// number format exception
		try {	String s1="riya";
			int n = Integer.parseInt(s1);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		 try {
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter first number:");
	            int num1 = sc.nextInt();
	            System.out.println("Enter second number:");
	           int  num2 = sc.nextInt();
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
			
		 }  finally {
	            System.out.println("Finally block executed");
		
	}}}
		 


