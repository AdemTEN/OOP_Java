package day33_ClassObjects_Constructor;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your starting balance");
		String input = scan.next();
		
		BankAccount account = new BankAccount(input);
		System.out.println("How much were you pay this month");
		input = scan.next();
		account.deposit(input);
		System.out.println("Your pay has been deposit. Your current balance is: " + account.getBalance());
		
	}

}
