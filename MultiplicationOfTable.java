package conditionalloops;
import java.util.Scanner;
public class MultiplicationOfTable {
public static void main(String[] args) {
	int num=0;
	int mul=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("multiplication of :");
	num=sc.nextInt();
	for(int i=1;i<=10;i++) {
		mul=i*num;
		System.out.println(mul );
	}
}
}
