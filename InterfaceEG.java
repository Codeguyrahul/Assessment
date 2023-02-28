package polymorphism;

interface InterfaceEG {
	
	void show();

}
class Interface implements  InterfaceEG{
	public void show() {
		System.out.println("parent Interface method");
	}
	public static void main(String[] args) {
		Interface object = new Interface();
		object.show();
	}
}