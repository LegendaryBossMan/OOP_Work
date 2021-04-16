
public class Student extends Personnel
{
	String dateOfBirth;
	String registrationDate;

	public  Student
				(
					String firstName,
					String lastName,
					String SSN
				)  throws Exception
				{ 
					super(firstName,lastName,SSN);
				}
				
	public  Student(
				String firstName,
				String lastName,
				String SSN,
				String address,
				String dateOfBirth,
				String registrationDate) throws Exception
				 
				{ 
					super(firstName,lastName,SSN,address,dateOfBirth);
					SetRegistrationDate(registrationDate);
					
				}
				
	public void SetRegistrationDate(String registrationDate)
				{ 
					this.registrationDate = registrationDate;
				}
	public String GetRegistrationDate()
				{ 
					return this.registrationDate;
				}
	public  void DisplayAllInfo()
	{
	  super.DisplayLine(20,"*");
	  super.DisplayAllInfo();
	  DisplayStudentInfo();
	  super.DisplayLine(20,"*");
	 
	}
	public void DisplayStudentInfo()
	{
		System.out.println("Registration Date:" + GetRegistrationDate());
	}
   
}