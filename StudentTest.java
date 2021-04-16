import java.util.Scanner;
public class StudentTest
{
  public static void main(String[] args)
  {
    Student myStudent = new Student("07/10/2018");
    
    //add a display and a input function for the information
    Scanner input = new Scanner(System.in);
    //Inputs for 
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
//    
//    System.out.println("Enter First Name: ");
    
    
    
    //start try catch
    try 
    {
      Student s = new Student(firstName, lastName, SSN);
      s.DisplayAllInfo();
    }
    catch(Exception ex)
    {
     System.out.println(ex.getMessage()); 
    }
    
    
    }
  }//EOC