import java.util.*;
import java.util.regex.*;

abstract class Personnel
{
	private String SSN;
	private String lastName;
	private String firstName;
	private String address;
	private String dateOfBirth;
	private String SSNRegEx = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
	
	
	// Constructors 
	public  Personnel(String firstName,String lastName,String SSN) throws Exception
	{
		//this.empID = UUID.randomUUID().toString();
		
		this.lastName = lastName;	
		this.firstName = firstName;	
		this.dateOfBirth="";

		try
		{SetSSN(SSN);
		}
		catch (Exception Ex)
		{throw Ex;}
			
	}  
	 public  Personnel(String firstName,String lastName,String SSN,String address,String dateOfBirth) throws Exception
	{
		this.lastName = lastName;	
		this.firstName = firstName;	
		this.dateOfBirth=dateOfBirth;
		this.address=address;
	
 
		try
		{SetSSN(SSN);
		}
		catch (Exception Ex)
		{throw Ex;}
		
		 
	 
	}

	// Accessors 
	public String GetFirstName()
		{return this.firstName;}
	public String GetLastName()
		{return this.lastName;}
	public String GetSSN()
		{return this.SSN;}
	public String GetAddress()
		{return this.address;}
	public String GetDateOfBirth()
		{return this.dateOfBirth;}
		
	// Mutators
	public void SetFirstName(String firstName)
		{this.firstName = firstName;} 
	public void SetLastName(String lastName)
		{this.lastName = lastName;}
	public void SetAddress(String address)
		{this.address = address;} 
	public void SetDateOfBirth(String dateOfBirth)
		{this.dateOfBirth = dateOfBirth;}		
	public void SetSSN(String SSN) throws Exception
		{Pattern pattern = Pattern.compile(SSNRegEx);
		if (pattern.matcher(SSN).matches()!=true)
			throw new Exception("Please enter a valid SSN");
		else
		 
			this.SSN = SSN;
		}

	// Static Methods		
	protected static void DisplayLine(Integer length) 
	 { for (Integer i =0;i<length;i++)
			System.out.print("_");
		System.out.println();	
	 }
	protected static void DisplayLine(Integer length,String character)
	{ for (Integer i =0;i<length;i++)
			System.out.print(character);
		System.out.println();	
	 } 
	// Instance Methods
	public  String GetFormattedName()
		{return lastName + ", " + firstName;} 
		
	public  void DisplayAllInfo()
	{
	 
	  System.out.println("Employee Name:" + GetFormattedName());
	  System.out.println("SSN:" + "***-**-" +this.SSN.substring(7,11));
	 	
	}
}