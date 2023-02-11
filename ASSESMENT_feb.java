package method;

 class  StaticVariable1{
	int age;
	int rollno;
	String name;
	float fee;
	static String college="SRM";

	 StaticVariable1(int age, int rollno,String name,float fee ){
		this.age=age; 
		this.rollno= rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(age+rollno+" "+name+" "+fee+" "+college);
	}
	public class ASSEMENT_feb{
	public static void main(String[] args) {
		StaticVariable1 s1=	new StaticVariable1(23,111," pallabi",5000);
		StaticVariable1 s2= new StaticVariable1(24,555,"amit",6000);
		s1.display();
		s2.display();
}
	}
 }
