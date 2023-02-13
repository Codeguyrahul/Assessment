package inheritance;
class s1{// parent class
	int bonus =15000;
	void show() {
		System.out.println("bonus is:"+bonus);
	}
}
	

 class s2 extends s1{
	 int salary= 30000;
	void display() {
		System.out.println("salary is:"+salary);
	}
}
class s3 extends s2{
	 int annualsal =salary + bonus;
	void print() {
		System.out.println("annual salary is:"+annualsal);
	}
}


public class ASSEMENT_Multilevel {
	public static void main(String[] args) {
		s3 child =new s3();
		child.display();
		child.show();
		child.print();
		
	}
	}

	
