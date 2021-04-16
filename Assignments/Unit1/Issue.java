import java.io.*;

public class Issue 
{
 //Declarations
  private Integer IssueNumber;
  private Integer TotalAds;
  private Integer TotalRev;
  private String Motto = "Everything You need to know";
  
  
  public Issue()
  {
   IssueNumber = 1;
   TotalAds = 0;
   TotalRev = 0;
  }

  public Issue(Integer IN, Integer TA)
  {
    setIssueNumber(IN);
    setTotalAds(TA);
   TotalRev = 50;
    
  }
    public Issue(Integer IN, Integer TA)
  {
    setIssueNumber(IN);
    setTotalAds(TA);
   setTotalRev(TR);
    
  }
   // Set Issue
 public void setIssueNumber(Integer IN) 
 {
  this.IssueNumber = IN;
 }
 
 // Get IssueNum
 public Integer getIssueNumber() 
 {
  return this.IssueNumber;
 }
  
  
    // Set Ads
 public void setTotalAds(Integer TA) 
 {
  this.TotalAds = TA;
 }
 
 // Get Ads
 public Integer getTotalAds() 
 {
  return this.TotalAds;
 }
 
   // Set Rev
 public void setTotalRev(Integer TR) 
 {
  this.TotalRev = TR;
 }
 
 // Get Rev
 public Integer getTotalRev() 
 {
  return this.TotalRev;
}
 //Display
 public void Display1()
 {
 
 System.out.println("Rockford Daily Clarion");
 System.out.println("______________________");
 System.out.println("Issue Number: "+this.IssueNumber);
 System.out.println("Advertising Sold:  "+this.TotalAds);
 System.out.println("Advertising Revenue: S"+this.TotalRev+"/ad");
}
  
}