import java.io.*;

public class AutoLoanTester {
	
	public static void main(String[] args) {
		
		/*if (args.length > 0) {
			for (Integer i = 0; i < args.length; i++) {
					System.out.println("Hello, " + args[i] + "!");
			}
		} else {
			System.out.println("Hello, World!");
		}*/
		
		AutomobileLoan myCarLoan = new AutomobileLoan();
		
		myCarLoan.setLoanNumber("LHJ00001");
		myCarLoan.setCarMake("Honda");
		myCarLoan.setCarModel("Accord");
		myCarLoan.setLoanAmount(30000.00);
		myCarLoan.setMonthlyPayment(300.00);
		myCarLoan.setBalance();
		myCarLoan.updateBalance();
		myCarLoan.displayLoanInfo();
	}
}