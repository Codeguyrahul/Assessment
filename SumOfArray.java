package Array;
import java.util.Scanner;
public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element of array");
		int size= sc.nextInt();
		
		int number[]=new int[size];
		System.out.println("enter the number:"+number);
		
		int sum=0;
		for(int i=0;i<size;i++) {
			
			
			 number[i]=sc.nextInt();
			 
			 
		sum=sum+number[i];
		
	
		}
		
		System.out.println("Sum of the Array:"+sum);

}}
