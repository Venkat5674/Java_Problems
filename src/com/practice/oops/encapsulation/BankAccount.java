package com.practice.oops.encapsulation;



public class BankAccount {
    private String accountNumber;
    private String holderName;
    private String branchName;
    private String ifscCode;
    private double balance;
    private int age;

    public BankAccount setAccountNumber(String accountNumber) {
        if (this.accountNumber == null) {  // can set only once
            this.accountNumber = accountNumber;
        }
        return this;
    }

    public int getAge() {
        return age;
    }

    public BankAccount setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        return this;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    public BankAccount setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public BankAccount setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
        return this;
    }

    public BankAccount setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
        return this;
    }
}
