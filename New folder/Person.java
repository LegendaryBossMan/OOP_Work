import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

abstract class Person
{
	 
	private String lastName;
	private String firstName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private Date dateOfBirth;
	private SimpleDateFormat  dateFormatter;
	// Constructors 
	public  Person(
			String firstName,
			String lastName) throws Exception
	{
		
		this.lastName = lastName;	
		this.firstName = firstName;		
		this.address="";
		this.city="";
		this.state="";
		this.zipCode="";
		dateFormatter= new SimpleDateFormat("dd/mm/yyyy");
		try
		{this.dateOfBirth = dateFormatter.parse("01/01/1900");}
		catch (Exception ex)
		{throw ex;}
		
	}  
	 
	public  Person(
			String firstName,
			String lastName,
			String address,
			String city,
			String state,
			String dateOfBirth,
			String zipCode) throws Exception
	{
		 
		this.lastName = lastName;	
		this.firstName = firstName;	
        this.address = address;
		this.city = city;
		this.state = state;
		dateFormatter= new SimpleDateFormat("dd/mm/yyyy");
		try
		{this.dateOfBirth = dateFormatter.parse(dateOfBirth);}
		catch (Exception ex)
		{throw ex;}
		   
		   
		   
	 
	}
	// Accessors 
	public String GetFirstName()
		{return this.firstName;}
	public String GetLastName()
		{return this.lastName;}
	public String GetAddress()
		{return this.address;}
	public String GetCity()
		{return this.city;}
	public String GetState()
		{return this.state;}
	public String GetZip()
		{return this.zipCode;}
	public Date GetDateOfBirth()
		{return this.dateOfBirth;}
	 
		
	// Mutators
	public void SetFirstName(String firstName)
		{this.firstName=firstName;}
	public void SetLastName(String lastName)
		{this.lastName=lastName;}
	public void SetAddressName(String address)
		{this.address=address;}
	public void SetCity(String city)
		{this.city=city;}
	public void SetState(String state)
		{this.state=state;}
	public void SetZipCode(String zipCode)
		{this.zipCode=zipCode;}
	public void SetDateOfBirth(String dateOfBirth) throws Exception
		{try
			{ 
				this.dateOfBirth=dateFormatter.parse(dateOfBirth);}
		 catch (Exception ex)
		 {throw ex;}
		}


	// Static Methods		
	private static void DisplayLine(Integer length) 
	 { for (Integer i =0;i<length;i++)
			System.out.print("_");
		System.out.println();	
	 }
	private static void DisplayLine(Integer length,String character)
	{ for (Integer i =0;i<length;i++)
			System.out.print(character);
		System.out.println();	
	 } 
	// Instance Methods
	public  String GetFormattedName()
		{return lastName + ", " + firstName;} 
		
	public  void DisplayPersonInfo(String preferredCharacter)
	{
	  DisplayLine(lastName.length() + firstName.length() + 2,preferredCharacter);
	
	  System.out.println("Employee Name:" + GetFormattedName());
	  System.out.println("Address:" + this.address);
	  System.out.println("City:" + this.city);
	  System.out.println("State:" + this.state);
	  System.out.println("Zip Code:" + this.zipCode);
	  System.out.println("Date of Birth:" + this.dateOfBirth);
	  DisplayLine(lastName.length() + firstName.length() + 2,preferredCharacter);
		
	}
}