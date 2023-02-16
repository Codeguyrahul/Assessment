package cognizant.shapes;


class Teacher { // Super class
String designation = "Teacher";
String collegeName = "MIT";
void work(){
	System.out.println("Teaching");
	}
}
public class MathTeacher extends Teacher{// main class and child class
	String mainSubject = "Math";
	public static void main(String args[]){// main method
		MathTeacher obj = new MathTeacher(); //create object

System.out.println(obj.collegeName);

System.out.println(obj.designation);
System.out.println(obj.mainSubject);
obj.work(); // call method
}
}
