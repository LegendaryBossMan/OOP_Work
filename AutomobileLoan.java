public class AutomobileLoan {

	private String loanNumber;
	private String carModel;
	private String carMake;
	private Double loanAmount;
	private Double balance;
	private Double monthlyPayment;	
	
	public String getLoanNumber() {
		return loanNumber;
	}
	
	public void setLoanNumber(String loanNum) {
		loanNumber = loanNum;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public void setCarModel(String model) {
		carModel = model;
	}

	public String getCarMake() {
		return carMake;
	}
	
	public void setCarMake(String make) {
		carMake = make;
	}
	
	public Double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(Double loanAmt) {
		loanAmount = loanAmt;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void setBalance() {
		if (this.balance == null) {
			this.balance = this.loanAmount;
		}
	}	
	
	public Double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public void setMonthlyPayment(Double pmt) {
		monthlyPayment = pmt;
	}
	
	public void updateBalance() {
		this.balance = this.balance - this.monthlyPayment;
	}
	
	public void displayLoanInfo() {
		System.out.println("__________________________");
		System.out.println("Loan Number: " + this.loanNumber);
		System.out.println("Car Make: " + this.carMake);
		System.out.println("Car Model: " + this.carModel);
		System.out.println("Loan Amount: " + this.loanAmount);
		System.out.println("Monthly Payment: " + this.monthlyPayment);
		System.out.println("Balance: " + this.balance);		
		System.out.println("__________________________");
	}
			
}