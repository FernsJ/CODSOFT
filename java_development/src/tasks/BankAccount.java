package tasks;

import java.util.Scanner;

class ATM {
	
	Scanner sc = new Scanner(System.in);
	
	int AccountNo;
	String AccountHolder;
	String Bank;
	String Branch;
	String Address;
	int MobileNo;
	double AccountBalance;
	
	
	
	public ATM(int AccountNo, String AccountHolder, String Bank, String Branch, String Address, int MobileNo, Double AccountBalance){			//ATM class constructor
		
		this.AccountNo = AccountNo;
		this.AccountHolder = AccountHolder;
		this.Bank = Bank;
		this.Branch = Branch;
		this.Address = Address;
		this.MobileNo = MobileNo;
		this.AccountBalance = AccountBalance;
		
																																	}
	
	public void accountDetails() {				// method to display account details
		
		System.out.println("\n****Account Details****\n");
		System.out.println("Account No: "+AccountNo);
		System.out.println("Account Holder: "+AccountHolder);
		System.out.println("Bank: "+Bank);
		System.out.println("Branch: "+Branch);
		System.out.println("Address: "+Address);
		System.out.println("Mobile No: "+MobileNo);
		System.out.println("Account Balance : Rs."+AccountBalance);
		
		
								}
	
	public void withdraw() {			// method to withdraw money
	    
		double amount;
	    
	    do {
	        System.out.println("\nEnter Amount to Withdraw: ");
	        amount = sc.nextDouble();
	        
	        if (amount <= 0) 
	            System.out.println("\nEnter Valid Amount!");
	        else if (amount > AccountBalance) 
	            System.out.println("\nINSUFFICIENT BALANCE! Enter valid amount");
	       
	    } while (amount <= 0 || amount > AccountBalance);
	    
	    AccountBalance -= amount;
	    System.out.println("\nAmount Withdrawed successfully");
	    System.out.println("\nUpdated Balance: Rs." + AccountBalance);
	}


	
	public void deposit() {					// method to deposit money
	    
		double amount;
	    
	    do {
	        System.out.println("\nEnter Amount to Deposit: ");
	        amount = sc.nextDouble();
	        
	        if (amount <= 0) {
	            System.out.println("\nEnter a valid amount");
	        }
	    } while (amount <= 0);
	    
	    AccountBalance += amount;
	    System.out.println("\nAmount deposited successfully");
	    System.out.println("\nUpdated Balance: Rs." + AccountBalance);
	}

	
	public void checkBalance() {				// method to check balance
		System.out.println("\nAvailable Balance in your Acccont is Rs. "+AccountBalance);
							   }
	
		}

public class BankAccount {

	public static void main(String[] args) {
		
		ATM atm = new ATM(24488812,"John Gray", "HDFC Bank", "Goa", "Maple Avenue",777666555,10000.0);  //instance of ATM class
		
		boolean exit = false;
		
		do {				// execute the following task until the user choose to exit
			
		System.out.println("\n***Welcome! Enter Corresponding number to perform a Task***\n");
		System.out.println("1. Get Account Details\n2. Withdraw Money\n3. Desposit Money\n4. Check Balance\n5. Exit\n");
		Scanner mc = new Scanner(System.in);
		int userAction = mc.nextInt();
		
		switch(userAction){
		
		case 1: atm.accountDetails();
		break;
		
		case 2: atm.withdraw();
		break;
		
		case 3: atm.deposit();
		break;
		
		case 4: atm.checkBalance();
		break;
		
		case 5: exit = true;
				System.out.println("Thank you for using ATM");
		break;
		
		default: System.out.println("Invalid Input!!");
		break;
		
		}
			
		}while(!exit);
		
	}

}
