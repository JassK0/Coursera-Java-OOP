package codeAlong.Banking;

import java.util.Scanner;

public class Bank {
/**
 * represents a bank for managing customers & their bank accounts.
 * @author Jassnoor Kahlon
 * @throws Exception 
 */
public static void main(String[] args) throws Exception {
    // Creates new instance of bank class.
    Bank bank = new Bank();
    // Calls run method in bank class
    bank.run();
    
}

/**
 * runs the program by initializing and managing bank accounts & customers.
 * @throws Exception 
 */
public void run() throws Exception{
System.out.println("Welcome to the bank. Please enter your name: ");

// Creates new scanner
Scanner scanner = new Scanner(System.in);
String name = scanner.next();

System.out.println("Hello " + name + ". Checking and savings accocunts beinng  created!");

//Create customer with given name
Customer customer = new Customer(name);

//Get user address
System.out.println("Enter your address: ");
String address = scanner.next();

customer.setAddress(address);

//Create checking account for customer
BankAccount checkingAccount = new BankAccount("Checking", customer);
//Create savings account for customer
BankAccount savingsAccount = new BankAccount("Savings", customer);

//Gets and prints customer info for checkign account & savings account
System.out.println();
System.out.println("Customer info: ");
System.out.println(checkingAccount.getCustomerInfo());

//Get account info
System.out.println("-------------------");
System.out.println("Checking Account: ");
System.out.println(checkingAccount.getAccountInfo());
System.out.println();
System.out.println("Savings Account: ");
System.out.println(savingsAccount.getAccountInfo());
System.out.println("-------------------");

//Make deposits into the accounts
System.out.println("Would you like to make a deposit? y/n or both ");
String choice = scanner.next();
if (choice.equals("y")) {
    System.out.println("Choose Account: ");
    String acc = scanner.next();
    if (acc.equals("checking")) {
        System.out.println("Enter amount to deposit into checking account: ");
        double amount = scanner.nextDouble();
        checkingAccount.deposit(amount);
        System.out.println("Checking Account: ");
        System.out.println(checkingAccount.getAccountInfo());

    }else if (acc.equals("savings")) {
        System.out.println("Enter amount to deposit into savings account: ");
        double amount = scanner.nextDouble();
        savingsAccount.deposit(amount);
        System.out.println("Savings Account: ");
        System.out.println(savingsAccount.getAccountInfo());
    }
    
}else if (choice.equals("n")) {
    System.out.println("-------------------");
    System.out.println("Checking Account: ");
    System.out.println(checkingAccount.getAccountInfo());
    System.out.println();
    System.out.println("Savings Account: ");
    System.out.println(savingsAccount.getAccountInfo());
    System.out.println("-------------------");
}
System.out.println("-------------------");
System.out.println("Checking Account: ");
System.out.println(checkingAccount.getAccountInfo());
System.out.println();
System.out.println("Savings Account: ");
System.out.println(savingsAccount.getAccountInfo());
System.out.println("-------------------");

// Make withdrawls to the accounts
System.out.println("Would you like to make a withdrawl? y/n or both ");
choice = scanner.next();
if (choice.equals("y")) {
    System.out.println("Choose Account: ");
    String acc = scanner.next();
    if (acc.equals("checking")) {
        System.out.println("Enter amount to withdraw from checking account: ");
        double amount = scanner.nextDouble();
        checkingAccount.withdraw(amount);
        System.out.println("Checking Account: ");
        System.out.println(checkingAccount.getAccountInfo());

    }else if (acc.equals("savings")) {
        System.out.println("Enter amount to withdraw from savings account: ");
        double amount = scanner.nextDouble();
        savingsAccount.withdraw(amount);
        System.out.println("Savings Account: ");
        System.out.println(savingsAccount.getAccountInfo());
    }
    
}else if (choice.equals("n")) {
    System.out.println("-------------------");
    System.out.println("Checking Account: ");
    System.out.println(checkingAccount.getAccountInfo());
    System.out.println();
    System.out.println("Savings Account: ");
    System.out.println(savingsAccount.getAccountInfo());
    System.out.println("-------------------");
}
System.out.println("-------------------");
System.out.println("Checking Account: ");
System.out.println(checkingAccount.getAccountInfo());
System.out.println();
System.out.println("Savings Account: ");
System.out.println(savingsAccount.getAccountInfo());
System.out.println("-------------------");

}




}

