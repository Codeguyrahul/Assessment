package ControlStatement.Loops;

public class Pattern2 {
public static void main(String[] args) {
	
	for(int i=1;i<5;i++) {//outerLoop(row)
		
		for(int j=5;j>=i;j--) {//innerloop(col)
		
			System.out.print(" ");}
		
			 for(int k=1;k<=i;k++) {
				 System.out.print(" *");
			 }
		
		System.out.println(" ");
	}
}
}


