package com.bank.system;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    // Create a new bank account
    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, accountHolderName, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    // View account details
    public void viewAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Deposit money into account
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money from account
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Transfer money between accounts
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = accounts.get(fromAccountNumber);
        Account toAccount = accounts.get(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            if (fromAccount.withdraw(amount)) {
                toAccount.deposit(amount);
                System.out.println("Transfer successful.");
            }
        } else {
            System.out.println("One or both accounts not found.");
        }
    }
}
