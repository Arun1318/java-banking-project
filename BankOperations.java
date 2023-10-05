package BankingOps;
import java.util.*;


public class BankOperations {
	
	private List<CustomerDetails> bankServer;
	
	//No - Argument constructer for the storing data into arraylist
	
	public BankOperations() {
		bankServer=new ArrayList<>();		
	}
	
	//Adding account  to Arraylist
	public void addAccount(CustomerDetails newAccount) {
		
		bankServer.add(newAccount);
		System.out.println("Data Saved");
	}
	
	public List<CustomerDetails> getAllAccounts() {
        return bankServer;
    }
	
	//Serching account Details
	public CustomerDetails searchingAccount(int id)
	{
		// auto boxing of int to Integeer
		Integer accountId=id;
		for(CustomerDetails customer : bankServer) {
			System.out.println("entered in loop");
			
			if(customer.getAccountNo().equals(accountId)) {
				System.out.println("your details are found");
//				System.out.println("Account number :"+customer.getAccountNo());
//				System.out.println("Customer Name :"+customer.getCustomerName());
//				System.out.println("Mobile Number :"+customer.getMobileNo());
//				System.out.println("Account Balance :"+customer.getBalance());
				return customer;
			}
		}
		return null;
	}
	
	//Updating Account
 	public void updateAccount(int id) {
		Integer accountId=id;
			
		for(CustomerDetails customer: bankServer) {			
			if(customer.getAccountNo().equals(accountId)) {
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter Customer name");
				String name = scan.next();
				customer.setCustomerName(name);
				System.out.println("Name updated successfully");			
			}
		}
	 			
	}
	
 		
	
	
	
	
	
	

}
