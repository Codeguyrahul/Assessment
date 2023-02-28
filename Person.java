package Assignment;

public interface Person {
  void	speak();

}
class Student implements Person{
	public void speak() {
		System.out.println("present sir");
	}
}
class Teacher implements Person{
	public void speak() {
		System.out.println(" roll no---");
		
	}
	public static void main(String[] args) {
		Person object= new Student();
		object.speak();
		Person obj= new Teacher();
		obj.speak();
		
	}
}