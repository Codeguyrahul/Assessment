package cognizant.shapes;

public class Empolyee {
	long employeeId	;
	String employeeName;	
	String employee_Address;
	long employee_Phone	;
 double	basicSalary	;
  double specialAllowance=250;
  double Hra=1000;
  public Empolyee(long id, String name, String address, long phone) {
	// TODO Auto-generated constructor stub


	  this.employeeId=id;
	  this.employeeName=name;
	  this.employee_Address=address;
	  this.employee_Phone=phone;
	
  }	void calculateSalary() {
		double salary = basicSalary+(basicSalary*specialAllowance/100)+( basicSalary * Hra/100); 
	      System.out.println("the salary of empolyee:"+salary);}
	void calculateTransportAllowance () {
		double transportAllowance = 10/100*basicSalary;
		System.out.println("Transport Allowance of peter:"+transportAllowance);
	}
}

class Manager extends Employee{
	public Manager(long id, String name,String address,long phone,double salary) {  
		
		super(id,name,address,phone);
		
		super.basicSalary=salary;
	}void calculateTransportAllowance (int basicSalary) {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport Allowance of peter:"+transportAllowance);
}}
	
class Trainee extends Empolyee{
	public Trainee(long id, String name,String address,long phone,double salary) {
		super(id,name,address,phone);
		super.basicSalary=salary;
	}
	void calculateTransportAllowance () {
		double transportAllowance = 15*basicSalary/100;
		System.out.println("Transport Allowance of peter:"+transportAllowance);
	
}
	

}



