package conditionalloops;
import java.util.Scanner;
public class Yearleap {
public static void main(String[] args) {
	int year=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year");
	year=sc.nextInt();
	
	if(year%4==0) {
		System.out.println( year+" is a leap year");
		
	}
	else {
		System.out.println( year+"is not a leap year");
	}
}
}
