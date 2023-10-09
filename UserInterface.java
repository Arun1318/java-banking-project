package BankingOps;

import java.util.*;



public class UserInterface {
	
	public static void main(String[] args) {
		BankOperations bankOps = new BankOperations();
		
		Scanner scan = new Scanner(System.in);
		int i=0;
		while(i!=1) {
		
		System.out.println("Enter 1 for creating Account");
		System.out.println("Enter 2 for serching Account Details");
		System.out.println("Enter 3 for updating Account");
		System.out.println("Enter 4 for Balance check");
		System.out.println("Enter 5 for deposit");
		System.out.println("Enter 6 for withdrawl");
		
		
		int number = scan.nextInt();
		
		if(number==1) {
			System.out.println("Enter customer id");
			int id=scan.nextInt();
			Integer customerId = id;
			
			System.out.println("Enter customer name");
			String name=scan.next();
			
			System.out.println("Enter Mobile no");
			int mNumber=scan.nextInt();
			
			System.out.println("Enter deposit");
			double deposit=scan.nextInt();
			
			CustomerDetails customer1=new CustomerDetails(customerId,name,mNumber,deposit);
			
			bankOps.addAccount(customer1);
						
		}
		
		else if(number==2){
			System.out.println("Enter Account Number");
			int idNo = scan.nextInt();
			CustomerDetails accountFound=bankOps.searchingAccount(idNo);
			if(accountFound!=null) {
				
				System.out.println("Account no  "+accountFound.getAccountNo());
				System.out.println("Customer name "+accountFound.getCustomerName());
				System.out.println("Mobile number "+accountFound.getMobileNo());
				System.out.println("Account Balance "+accountFound.getBalance());
			}
			else {
				System.out.println("Details not found");
			}
		}
		
		else if(number==3){
			System.out.println("Enter Account Number");
			int idNo = scan.nextInt();
			bankOps.updateAccount(idNo);			
			
		}
		else if(number==4) {
			System.out.println("Enter Account Number");
			int idNo = scan.nextInt();
			double accountBalance=bankOps.balanceCheck(idNo);
			System.out.println("your Account balance = "+accountBalance);
			
		}
		else if(number==5) {
			System.out.println("Enter Account Number");
			int idNo = scan.nextInt();
			bankOps.addMoney(idNo);
			
		}
		
		else if(number==6) {
			System.out.println("Enter Account Number");
			int idNo = scan.nextInt();
			System.out.println("Enter amount to withdrawl");
			int money = scan.nextInt();
			
			double getbalance=bankOps.balanceCheck(idNo);
			if(money>getbalance) {
				System.out.println("Insufficient Balance");
			}
			else {
				double total= getbalance-money;
				System.out.println("money Withdrawn");
				bankOps.updateBalance(idNo,total);
			}
			
		}
		
		
		System.out.println("enter 1 to exit");
		i=scan.nextInt();
		}
		                                         
	}

}
