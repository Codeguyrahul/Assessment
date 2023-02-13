package Inheritance2;



class s1{// parent class
	
	void show() {
		System.out.println("dogs are barked at night");
	}
}
	

 class s2 extends s1{
	 
	void display() {
		System.out.println("cat sound is meow");
	}
}



public class ex2{
	public static void main(String[] args) {
		s2 child =new s2();
		child.display();
		child.show();
		
		
	}
	}


