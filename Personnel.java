
abstract class Personnel {

 // Declare instance variables.
 private String firstName;
 private String middleName;
 private String lastName;
 private String SSN;
 private String Gender;
 private String DOB;
 private String HOR;
 
 
 Personnel(String fName, String lName)
 {
  setFirstName(fName);
  setLastName(lName);
 }
 public Personnel(String fName, String lName, String mName, String ssn, String Gender, String DOB, String HOR) {
  setFirstName(fName);
  setLastName(lName);
  //setMiddleName(mName);
  setSocial( ssn);
  setGender(Gender);
  setDateOfBirth(DOB);
  setHome( HOR);
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
 
 // Set Social
 public void setSocial(String ssn)
 {
   this.SSN = ssn;
   
 }

 
  // Get Social
 public String getSocial()  
 {
   return this.SSN;   
 }
 
//  // Set Middle Name
// public void setMiddleName(String mName)
// {
//   this.MiddleName = mName;
//   
// }
//
// 
//
//  // Get Middle Name 
// public String getMiddleName()
// {
//   return this.mName;
//   
// 
// }
 
  // Set Gender
 public void setGender(String Gender)
 {
   this.Gender = Gender;
   
 }
 
 //Get Gender
 public String getGender()
 {
  return this.Gender; 
 }
 
   // Set DOB
 public void setDateOfBirth(String DOB)
 {
   this.DOB = DOB;
   
 }
 
 //Get DOB
 public String getDateOfBirth()
 {
  return this.DOB;
 }
 
   // Set HOR
 public void setHome(String HOR)
 {
   this.HOR = HOR;
   
 }
 
 //Get HOR
 public String getHome()
 {
  return this.HOR;
 }
 
 
 
 // Display data.
 public void displayPersonnel() {

  System.out.println("First Name: " + this.firstName);
  System.out.println("Last Name: " + this.lastName);

  System.out.println();
 }
 
}
 
