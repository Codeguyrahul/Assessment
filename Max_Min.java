package OBJECT;
import java.util.Scanner;


public class Max_Min {
	public static void main(String[] args) {
		int num1,num2;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1:");
		num1=sc.nextInt();
		System.out.println("enter the number2:");
		num2=sc.nextInt();
		if(num1>num2) {
			if(num1<num2) {
				System.out.println("value1 is minimum:"+num1);
			
			}else {
				System.out.println("value2 is minimum:"+num2);
			}
			System.out.println("value1 is maximum:"+num1);
			
		} else {
			System.out.println("value2 is maximum:"+num2);
		} 
		
		
	}

}
