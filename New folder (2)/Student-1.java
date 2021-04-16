public class Student extends Personnel
{
	private String Major;

	public  Student
				(
					String firstName,
					String lastName,
					String SSN,
					String Major
				)  throws Exception
				{ 
				super(firstName,lastName,SSN);
			if(Major.length() <1) 
				 throw new Exception("Must have a major");
		
				}
				
	public void SetMajor(String Major)
				{ 
					this.Major = Major;
				}
	public String Major()
				{ 
					return this.Major;
				}
}
