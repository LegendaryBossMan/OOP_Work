import java.text.DecimalFormat;
import java.util.Scanner;
public class Pizza {

 /* 
 Author: Nazareth Bishop
 Date: 7/12/2018
 
 Employee class.
 */

 // Declare instance variables.
 private String topping;
 private String topping2;
 private String topping3;
 private Integer Size1 = 12;
 private Integer Size2 = 14;
 private Integer Size3 = 15;
 private Double Price1 = 13.99;
 private Double Price2 = 16.99;
 private Double Price3 = 19.99;
 
 // Overloaded constructors.
  public Pizza(String t1,Integer s1,Integer s2, Integer s3,Double p1,Double p2,Double p3)
 {
 setTopping1(t1);
 setSize1(s1);
 setSize2(s2);
 setSize3(s3);
 setPrice1(p1);
 setPrice2(p2);
 setPrice3(p3);
    
 }
   public Pizza(String t1,String t2,Integer s1,Integer s2, Integer s3,Double p1,Double p2,Double p3)
 {
 setTopping1(t1);
 setTopping2(t2);    
 setSize1(s1);
 setSize2(s2);
 setSize3(s3);
 setPrice1(p1);
 setPrice2(p2);
 setPrice3(p3);
 }
 public Pizza(String t1,String t2, String t3,Integer s1,Integer s2, Integer s3,Double p1,Double p2,Double p3)
 {
 setTopping1(t1);
 setTopping2(t2);
 setTopping3(t3);
 setSize1(s1);
 setSize2(s2);
 setSize3(s3);
 setPrice1(p1);
 setPrice2(p2);
 setPrice3(p3);
 
 }
 // Set Topping 1
 public void setTopping1(Integer t1) 
 {
  this.Topping1 = t1;
 }
 
 // Get Topping 1
 public String getTopping1() {
  return this.Size1;
 }
 
  // Set Topping 2
 public void setTopping2(Integer t2) 
 {
  this.Topping2 = t2;
 }
 
 // Get Topping 2
 public String getTopping2() {
  return this.Topping2;
 }
 
  // Set Topping 3
 public void setTopping3(Integer t3) 
 {
  this.Topping3 = t3;
 }
 
 // Get Topping 3
 public String getTopping3() {
  return this.Topping3;
 }
 

 // Set Size 1
 public void setSize1(Integer s1) 
 {
  this.Size1 = s1;
 }
 
 // Get Size 1
 public String getSize1() {
  return this.Size1;
 }
 
  // Set Size 2
 public void setSize2(Integer s2) 
 {
  this.Size2 = s2;
 }
 
 // Get Size 2
 public String getSize2() {
  return this.Size2;
 }
 
   // Set Size 3
 public void setSize3(Integer s3) 
 {
  this.Size3 = s3;
 }
 
 // Get Size 3
 public String getSize3() {
  return this.Size3;
 }
 
 //Prices
   // Set Price 1
 public void setPrice1(Double p1) 
 {
  this.Price1 = p1;
 }
 
 // Get Price 1
 public String getPrice1() {
  return this.Price1;
 }
 
   // Set Price 2
 public void setPrice2(Double p2) 
 {
  this.Price2 = p2;
 }
 
 // Get Price 2
 public String getPrice2() {
  return this.Price2;
 }
 
   // Set Price 3
 public void setPrice3(Double p3) 
 {
  this.Price3 = p3;
 }
 
 // Get Price 1
 public String getPrice3() {
  return this.Price1;
 }
 

 

 
 // Display data.
 public void display() {


}
 
}
