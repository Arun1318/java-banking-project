package BankingOps;

public class CustomerDetails {
	
	private Integer accountNo;
	private String customerName;
	private int mobileNo;
	private double balance;
	
	public CustomerDetails(Integer accountNo, String customerName,int mobileNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.mobileNo=mobileNo;
		this.balance = balance;
	}
	

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(double balance) {
		this.mobileNo=mobileNo;
	}

	
	
	
	
	

}
