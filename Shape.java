package Assignment;

 abstract public class Shape {
 abstract void calculate_Area();
}
 class Circle extends Shape{
	  void  calculate_Area(){
		 System.out.println(" circle area formula: 2*pi*r*hy");
		 
	 }
 }
 class Rectangle  extends Shape{
	    void  calculate_Area(){
		 System.out.println(" rectangle area formula:l*w");
 }public static void main(String[] args) {
	Shape object = new Circle();
	object.calculate_Area();
	Shape obj = new Rectangle  ();
	obj.calculate_Area();
}
	    }
 
