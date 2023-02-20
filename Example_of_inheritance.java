package cognizant.shapes;
class Engineer { // Superclass (parent class)
	  public void coding() 
	  {
	    	System.out.println("Computer Engineers are Programmers");
	  }
	}

	class Coder extends Engineer { // Subclass (child class)
	  public void coding()
	  {
	    super.coding(); 	// Call the superclass method
	    System.out.println("Coders also know many Programming languages");
	  }
	}

	 	// Call the method on the Coder object
	  
public class Example_of_inheritance {
	public static void main(String[] args) {
		
		  Engineer e1 = new Coder(); 	// Creates a Coder object
		    e1.coding(); // Call the method on the Coder object
	}

}