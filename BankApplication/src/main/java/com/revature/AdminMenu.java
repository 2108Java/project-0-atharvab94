package com.revature;

import java.util.Scanner;

public class AdminMenu {
	public void AdminLogin() {
		Scanner admin = new Scanner(System.in); 
			System.out.println("enter your username admin");
			String name = admin.nextLine();
			System.out.println("enter your password admin");
			String password = admin.nextLine();
			
			if(name == "athu" && password == "athu") {
			AdminOption(); 
			}else 
				System.out.println("wrong try again");
		
	}
	public void AdminOption() {
		System.out.println("");
		System.out.println("Please make a selection");
		System.out.println(" | Type in a number |");
		System.out.println("");
		System.out.println("1.Open a new checking account");
		System.out.println("2.Open a new savings account");
		System.out.println("3.Deposit money");
		System.out.println("4.Transfer money");
		System.out.println("5.Start a joint account");
		System.out.println("6.Approve a new user");
		System.out.println("7.Logout");
	}
	public int AdminInput() {
		Scanner sc = new Scanner(System.in);
		int key = -1;
		while(key< 0 ||  key> 7) {
			try {
				System.out.println("\nEneter number:");
				key = Integer.parseInt(sc.nextLine());
				System.out.println("");
				if (key< 0 ||  key> 7)
				{
					System.out.println("--Invalid Option--");
				}
			}
			catch (NumberFormatException e)	{
				System.out.println("invalid number");
			}
			
			}
		return key;
		}	
	
	}



