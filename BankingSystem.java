package com.bank.system;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();
                    bank.createAccount(accountNumber, accountHolderName, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String viewAccountNumber = sc.nextLine();
                    bank.viewAccount(viewAccountNumber);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String depositAccountNumber = sc.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(depositAccountNumber, depositAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String withdrawAccountNumber = sc.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    bank.withdraw(withdrawAccountNumber, withdrawAmount);
                    break;

                case 5:
                    System.out.print("Enter from account number: ");
                    String fromAccount = sc.nextLine();
                    System.out.print("Enter to account number: ");
                    String toAccount = sc.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = sc.nextDouble();
                    bank.transfer(fromAccount, toAccount, transferAmount);
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
