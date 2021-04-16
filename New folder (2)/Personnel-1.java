import java.util.*;
import java.util.regex.*;

abstract class Personnel
{
	private String SSN;
	private String lastName;
	private String firstName;
	
	public  Personnel(String firstName,String lastName,String SSN) throws Exception
	{
		
		this.lastName = lastName;	
		this.firstName = firstName;	
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
			
		// Mutators
		public void SetFirstName(String firstName)
			{this.firstName = firstName;} 
		public void SetLastName(String lastName)
			{this.lastName = lastName;}
		public void SetSSN(String SSN) {
			{this.SSN = SSN;}
		}
}