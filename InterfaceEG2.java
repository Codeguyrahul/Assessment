package polymorphism;

interface InterfaceEG2 {
	
	void shape();

}
class circle implements InterfaceEG2{
	public void shape() {
		int r=4;
		float area=(float) (3.14*r*r);
		System.out.println("Draw a circle"+area);
	}
}
class Triangle implements InterfaceEG2{
	public void shape() {
		int l=3;
		int w=6;
		int area1=l*w;
		System.out.println("Draw a Tiangle"+area1);
	}
	public static void main(String[] args) {
		 InterfaceEG2 object = new circle();
		object.shape();
		 InterfaceEG2 obj = new Triangle();
		 obj.shape();
	}
}
