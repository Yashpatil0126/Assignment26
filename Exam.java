
package assignment26;
import java.util.*;
public class Exam 
{
	private String name;
	private int rollNo;
	private double s1,s2,s3,avgMarks;
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter Roll no :");
		rollNo=sc.nextInt();
		System.out.println("Enter subject1 marks :");
		s1=sc.nextDouble();
		System.out.println("Enter subject2 marks :");
		s2=sc.nextDouble();
		System.out.println("Enter subject3 marks :");
		s3=sc.nextDouble();
	}
	
	public void calculation()
	{
		avgMarks=s1+s2+s3/3;
	}
	
	public void display()
	{
		System.out.println("Name of student : "+name);
		System.out.println("Rollno of student : "+rollNo);
		System.out.println("Subject one marks : "+s1);
		System.out.println("Subject two marks : "+s2);
		System.out.println("Subject three marks : "+s3);
		System.out.println("Average marks : "+avgMarks);
	}
	
	public void grade()
	{
		if(avgMarks>=60 && s1>=40 && s2>=40 && s3>=40)
		{
			System.out.println("Student has passed the exam..");
		}
		else
		{
			System.out.println("Sorry,You have failed !!!");
		}
	}
}
