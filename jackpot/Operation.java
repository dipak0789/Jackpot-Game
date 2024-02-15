package com.jackpot;

import java.util.Scanner;

public class Operation {
	static Scanner sc =  new Scanner (System.in);
	static UserOp uo = new UserOp();
	
	public static void getregistration() {
		User us = new User();
		System.out.println("Enter username");
		String userName = sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		
		us.setUserName(userName);
		us.setPass(pass);
		uo.addUser(us);
		System.out.println("Registration Successful");
		uo.displayUser();
		Test.Start();
	}
	public static void getLogin() {
		System.out.println("Enter User Name");
		String userName = sc.next();
		System.out.println("Enter PassWord");
		String pass = sc.next();
		System.out.println("Check");
		uo.Login(userName, pass);	
		
	}
	public static void getUserData() {
		uo.displayUser();
	}
	
}
