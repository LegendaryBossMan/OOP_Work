public class EmployeeTest {
	
	public static void main(String[] args) {
		
		// Declare and instantiate Employee objects; display Employee data.
		System.out.println();
		
		Employee employee1 = new Employee();
		employee1.display();		
		
		Employee employee2 = new Employee("Louis", "Harris");
		employee2.display();
		
		Employee employee3 = null;		
		try {
			employee3 = new Employee("Sasha", "Harris", 100001.00);			
			employee3.display();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		Employee.displayLine();
		
		
	}
	
	
}