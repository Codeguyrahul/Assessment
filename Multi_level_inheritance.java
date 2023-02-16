package cognizant.shapes;

class A{ // super class
	int Salary=100000;
}

class B extends A{ // child class
	int Expericence=5;
}

class C extends B{// 2nd child class
	String Role="web developer";
}

public class Multi_level_inheritance {//main class it is a multilevel inheritance
public static void main(String[] args) {
	C x =new C();// method create
	System.out.println("Salary:"+x.Salary +" "+ "Expericence:"+x.Expericence +" "+"Role:"+x.Role);//method call
}
}
