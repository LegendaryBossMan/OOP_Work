import java.text.DecimalFormat;

public class Employee {

 /* 
 Author: Louis Harris
 Date: 6/26/2018

 Description:
 Employee class.
 */

 // Declare instance variables.
 private String firstName;
 private String lastName;
 private Double baseSalary;
 private DecimalFormat df = new DecimalFormat("$#,##0.00");
 
 // Overloaded constructors.
 public Employee(){
  baseSalary = 20000.00;
 }
 
 public Employee(String fName, String lName) {
  setFirstName(fName);
  setLastName(lName);
  baseSalary = 20000.00;
 }
 
 public Employee(String fName, String lName, Double salary) throws Exception {
  if (salary < 20000.00) {
   throw new Exception("Invalid Base Salary entry for "
    + fName + " " + lName + ".\nBase Salary must be at least $20,000.00.");
  }
  
  if (salary > 100000.00) {
   throw new Exception("Invalid Base Salary entry for "
    + fName + " " + lName + ".\nBase Salary must be at most $100,000.00.");
  }
  
  setFirstName(fName);
  setLastName(lName);
  setBaseSalary(salary);
 }
 
 // Set firstName.
 public void setFirstName(String fName) {
  this.firstName = fName;
 }
 
 // Get firstName.
 public String getFirstName() {
  return this.firstName;
 }
 
 // Set lastName.
 public void setLastName(String lName) {
  this.lastName = lName;
 }
 
 // Get lastName.
 public String getLastName() {
  return this.lastName;
 }
 
 // Set baseSalary.
 public void setBaseSalary(Double salary) {
  this.baseSalary = salary;
 }
 
 // Get baseSalary.
 public Double getBaseSalary() {  
  return this.baseSalary;
 }
 
 // Display data.
 public void display() {

  System.out.println("First Name: " + this.firstName);
  System.out.println("Last Name: " + this.lastName);
  System.out.println("Base Salary: " + df.format(this.baseSalary));
  System.out.println();
 }
 
 public static void displayLine() {
  System.out.println("Nick said \"Mr. Goldstein is better than Mr. Sullivan.\"");
 }

}
