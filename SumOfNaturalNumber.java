package conditionalloops;
import java.util.Scanner;
public class SumOfNaturalNumber {
public static void main(String[] args) {

	int sum=0;
	int num=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	
	
	for(int i=1;i<=num;i++) {
		sum=sum+i;
	}
	System.out.println("Sum of  natural number is:"+sum);
}
}
