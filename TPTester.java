import java.io.*;
import java.util.*;

public class TPTester {

	public static void main(String[] args) {
		// Create a new TermPaper object.
		TermPaper termPaper = new TermPaper();
		
		// Set TermPaper properties.
		termPaper.setAuthorName("Louis Harris");
		termPaper.setSubject("OOP");
		termPaper.setGrade("A++");
		
		// Display TermPaper properties.
		System.out.println("Author: " + termPaper.getAuthorName());
		System.out.println("Subject: " + termPaper.getSubject());
		System.out.println("Grade: " + termPaper.getGrade());	
	}
		
}