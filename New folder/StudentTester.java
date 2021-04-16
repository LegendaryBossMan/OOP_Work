import java.util.*;
import java.io.Console;
import java.io.IOException;
 

public class StudentTester
{
	public static void main(String[] args)
	{
	String firstName;
	String lastName;
	String SSN;
	
	Console c = System.console();
	firstName = c.readLine("First Name:");
	lastName = c.readLine("Last Name:");
	SSN = c.readLine("SSN:");
	try
		{Student s = new Student(firstName,lastName,SSN);
		s.DisplayAllInfo();
		}
	catch (Exception ex)
	{ System.out.println(ex.getMessage());
		
	}
	    
	}
}