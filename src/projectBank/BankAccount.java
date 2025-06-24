package projectBank;

public class BankAccount {
	private double balance;
	private String password;

	public void createAccount(double balance, String password) {
		this.balance = balance;
		this.password = password;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void getBalance(String enteredPassword) {
		if (this.password.equals(enteredPassword)) {
			System.out.println("Your balance is: " + balance);
		} else {
			System.out.println("Access Denied");
		}
	}

	public void deposit(double amount, String enteredPassword) {
		if (this.password.equals(enteredPassword)) {
			if (amount > 0) {
				balance += amount;
				System.out.println("Deposit successful. New balance: " + balance);
			} else {
				System.out.println("Invalid deposit amount.");
			}
		} else {
			System.out.println("Access Denied");
		}
	}

	public void withdraw(double amount, String enteredPassword) {
		if (this.password.equals(enteredPassword)) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawal successful. New balance: " + balance);
			} else {
				System.out.println("Insufficient balance or invalid amount.");
			}
		} else {
			System.out.println("Access Denied");
		}
	}
}
