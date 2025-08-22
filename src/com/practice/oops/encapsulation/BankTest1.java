package com.practice.oops.encapsulation;

public class BankTest1 {

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount();
	        account.setBalance(9000);
	        account.setAge(21);
	        account.setHolderName("Venkatesh");
	        account.setBranchName("Guntur");
	        account.setIfscCode("SBIN0909");
	        account.setAccountNumber("98765432");

	        account.setAccountNumber("90909090"); // ignored since already set

	        System.out.println(account.getBalance());
	        System.out.println(account.getAge());
	        System.out.println(account.getAccountNumber());
	    }
	}



