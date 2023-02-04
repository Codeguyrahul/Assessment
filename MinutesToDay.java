package OBJECT;
import java.util.Scanner;

public class MinutesToDay {
	public static void main(String[] args) {
		
	
	
	 double minInYear = 60 * 24 * 365;

     Scanner sc = new Scanner(System.in);

     System.out.print("enter the number of minutes: ");

     double min = sc.nextDouble();

     long years =  (long) (min / minInYear);
     int days = (int) (min / 60 / 24) % 365;
     System.out.println(days+" day/"+" "+ years+"year ");
	}

}
	
