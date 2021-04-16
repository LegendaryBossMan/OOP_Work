import java.io.*;

public class IssueTester {
 
 public static void main(String[] args) 
 {
   
  Issue Issue1 = new Issue();
  Issue1.Display1();  
  
  Issue Issue2 = new Issue(2, 5);
  Issue2.Display1();
  
   Issue Issue3 = new Issue(10, 0, 1000);   
   Issue3.Display1();
 

   
 }
 
}