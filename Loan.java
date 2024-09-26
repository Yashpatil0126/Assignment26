package assignment26;
import java.util.*;
public class Loan 
{
	private int age;
	private String name;
	private double sal;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter age :");
		age=sc.nextInt();
		System.out.println("Enter salary :");
		sal=sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal+"$");
	}
	
	public void checkLoan()
	{
		if(age>=18 && age<=60 && sal>25000) 
		{
			System.out.println("Person is eligible for loan..");
		}
		else
		{
			System.out.println("Person is not eligible for loan..");
		}
	}
}