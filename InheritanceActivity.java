package cognizant.shapes;



public class InheritanceActivity {
public static  void main(String[] args) {
	Manager1 m=new Manager1(126534,"Peter","Chennai Idia",237844, 65000 );
	Trainee t=new Trainee(29846,"jack","Mumbai india",422085, 45000);
	
	m.calculateSalary();
	m.calculateTransportAllowance();
	t.calculateSalary();
	t.calculateTransportAllowance();
	
}
}

