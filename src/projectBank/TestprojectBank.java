package projectBank;
import java.util.Scanner;

public class TestprojectBank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount account = new BankAccount();

		
		System.out.print("Enter initial balance: ");
		double initialBalance = input.nextDouble();
		input.nextLine(); 
		
		
		System.out.print("Set your password: ");
		String pass = input.nextLine();
		account.createAccount(initialBalance, pass);

		
		System.out.print("Enter password to view balance: ");
		String enteredPass = input.nextLine();
		account.getBalance(enteredPass);

		
		System.out.print("Enter amount to deposit: ");
		double depositAmount = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter password: ");
		String depositPass = input.nextLine();
		account.deposit(depositAmount, depositPass);

		
		System.out.print("Enter amount to withdraw: ");
		double withdrawAmount = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter password: ");
		String withdrawPass = input.nextLine();
		account.withdraw(withdrawAmount, withdrawPass);
	}
}

