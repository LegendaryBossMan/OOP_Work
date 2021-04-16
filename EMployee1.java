
abstract class EMployee1 extends Personnel
{

 // Declare instance variables.
 private String JobTitle;
 private String DateOfHire;
 private String EmpType;
 private Integer Salary;
 

 
 
 public Exployee(String fName, String lName)
 {
  setFirstName(fName);
  setLastName(lName);
 }
 public Personnel(String fName, String lName,String jTitle ) {
  setFirstName(fName);
  setLastName(lName);
  setJobTitle(jTitle);

 }

 // Set JobTitle.
 public void setJobTitle(String jTitle) {
  this. = jTitle;
 }
 
 // Get JobTitle.
 public String getFirstName() {
  return this.firstName;
 }
 
 // Set Date Of Hire
 public void setLastName(String DOH) {
  this.lastName = lName;
 }
 
 // Get Date Of Hire.
 public String getLastName() {
  return this.lastName;
 }
 
 // Set Emp Type
 public void setEmpType(String eType)
 {
   this.EmpType = eType;
   
 }
 
  // Get Emp Type
 public String getEmpType() {
  return this.EmpType;
 }
 
 
  // Set Salary
 public void setSalary(Integer Salary)
 {
   this.Salary = Salary;
 }
 
 
 
  // Get Salary
 public String getSalary() {
  return this.Salary;
 }
 
 // Display data.
 public void display() {

  System.out.println("First Name: " + this.firstName);
  System.out.println("Last Name: " + this.lastName);
  //add print for emptype, salary, job title, ext

  System.out.println();
 }
 
}
 
