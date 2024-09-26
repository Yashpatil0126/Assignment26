
package assignment26;
import java.util.*;
public class Job 
{
	private String name;
	private String ug;
	private String exp;
	private String cleanRecord;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter name :");
		name=sc.next();
		System.out.println("Enter Bachlers degree :");
		ug=sc.next();
		System.out.println("Enter Experience :");
		exp=sc.next();
		System.out.println("If you have criminal record Say 'yes' else say 'no'");
		cleanRecord=sc.next();
	}
	
	public void display()
	{
		System.out.println("Name of person : "+name);
		System.out.println("Bachlers degree : "+ug);
		System.out.println("experience of person : "+exp);
		System.out.println("Criminal Record : "+cleanRecord);
		
	}
	
	public void eligible()
	{
		if(ug==exp && exp==cleanRecord && cleanRecord==ug )
		{
			System.out.println("Person is eligible for job..");
		}
		else
		{
			System.out.println("Not eligible..");
		}
	}
}