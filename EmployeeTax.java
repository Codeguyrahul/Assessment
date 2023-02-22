package com.cognizant.tax;
import java.util.Scanner;

  class TaxCalculator {
	static float basicSalary;
	static float tax;
	static boolean citizenship;
	static 	int nettSalary;
	
	static void calculateTax( ){
	
	tax= (30*basicSalary/100);
	 

	 System.out.println("The Tax of the employee  for  the "+ basicSalary +"is"+ tax);
	 
	}
	static void deductTax() {
		int nettSalary= (int) (basicSalary- tax);
		System.out.println("The nett salary of the employee:"+ nettSalary);
	}
 static  void	validateSalary() {
	 boolean response=(basicSalary>100000 && citizenship==true);
		if(response) {
			System.out.println("The salary and citizenship eligibility: "+response);
		}
		else {
			System.out.println("The salary and citizenship eligibility: "+response);
		}
   }




		
		
		
	}
  public class EmployeeTax{
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the salary");
		  TaxCalculator.basicSalary=sc.nextFloat();
		  System.out.println("is the citizen of employee is indian");
		  TaxCalculator.citizenship=sc.nextBoolean();
		  TaxCalculator.calculateTax();
		  TaxCalculator.deductTax();
		  TaxCalculator.validateSalary();
		  
		
	}
  }

