package com.jackpot;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOp {
	private ArrayList<User> list;
	
	public UserOp(){
		list = new ArrayList<User>();
	}
	public void addUser(User op) {
		list.add(op);
		
	}
	public void removeUser(User op) {
		list.remove(op);
	}
	public void displayUser() {
		for(User us: list) {
			System.out.println("UserName: "+us.getUserName()+" Password: "+us.getPass());
		}
	}
	public void Login(String userName, String pass) { 
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		for(User user: list) {
			String existingPassword = user.getPass();
			String existingUserName = user.getUserName();
			
			if(existingPassword.equals(pass)&& existingUserName.equals(userName)) {
			System.out.println("********Successfully Logged In********");
			found = true;
			while(found = true) {
				System.out.println("Press 'Y' for Play Game");
				String yes = sc.next();
//				yes.toLowerCase();
				if(yes.equals("y")) {
						if(user.getAmount()<=150) {
							System.out.println("Your Fund is low to play game!!");
							System.out.println("Add Minimum "+(300)+"Rs to play game");
							double amount =sc.nextDouble();
							user.addAmount(amount);
						}else {
							user.addAmount(-150);
							user.addAmount(Game.Play_Game());
							}
				}
						
				 else {
						break;
					}
					System.out.println("Your Net Fund is: "+user.getAmount());
					
				}	
			}
			
			else {
				System.out.println("Eneter valid UserName or PassWord");
				break;
			}
		}
	}
}
