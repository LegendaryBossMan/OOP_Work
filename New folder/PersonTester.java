
import java.util.*;
import java.io.Console;
import java.io.IOException;
 

public class PersonTester
{
	public static void main(String[] args)
	{
	 String lastName;
	 String firstName;
	 String address;
	 String city;
	 String state;
	 String zipCode;
	 String dateOfBirth;
	
	Console c = System.console();
	firstName = c.readLine("Please enter Employee's First Name:");
	lastName = c.readLine("Last Name:");
	/*  address= c.readLine("address:");
	  city= c.readLine("city:");
	  state= c.readLine("state:");
	  zipCode= c.readLine("zipCode:");
	  dateOfBirth= c.readLine("dateOfBirth:");
	 */
	
	try
		{Student s = new Student(firstName,lastName);
		s.DisplayPersonInfo("*");	
		}
		catch(Exception e)
		{System.out.println("Please enter a valid Salary");}
	}
}