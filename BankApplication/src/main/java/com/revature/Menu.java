package com.revature;

import java.util.Scanner;

public class Menu {
//set exit as false 
boolean exit; 

// creating panda banner
	private void printBanner() {
		System.out.println("+---------------------+");
		System.out.println("|	Welcome to    |");
		System.out.println("|	Panda Bank    |");
		System.out.println("+---------------------+");
		
	}
	
// making a startup menu with 3 types of login options 
	private void startLogin() {
		System.out.println("");
		System.out.println("Please make a selection");
		System.out.println(" | Type in a number |");
		System.out.println("");
		System.out.println("1.Customer Login");
		System.out.println("2.Register");
		System.out.println("3.Employee login");
		System.out.println("4.Exit");
	}

//gets user input for the login menu, sets the default value to -1 so it dosent have a 1-4 value, 
	private int getInput(){
	Scanner sc = new Scanner(System.in);
	int key = -1;
	while(key< 0 ||  key> 4) {
		try {
			System.out.println("\nEneter number:");
			key = Integer.parseInt(sc.nextLine());
			System.out.println("");
			if (key< 0 ||  key> 4)
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
	
	public void runLogin()
	{
		printBanner();
		while(!exit) {
			startLogin();
			int key = getInput();
			pickOption(key);
		}
		
	}
	
	private void pickOption(int key) {
		switch(key)
		{
		case 1: 
		customerLogin();
		break;
		case 2: 
		acctRegister();
		break;
		case 3: 
		employeeLogin();
		break;
		case 4: 
		exit = true;
		System.out.println("Farewell, thank you for using this app!");
		break;
		
		
		}
		}
	private void employeeLogin() {
		AdminMenu a = new AdminMenu();
		a.AdminLogin();
		a.AdminInput();
		exit = true; 
		
	}
	private void acctRegister() {
	
		
	}
	private void customerLogin() {
		
	}
	}

