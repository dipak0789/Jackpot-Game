package com.jackpot;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static void Start() {
		boolean b = true;
		while(b) {
			System.out.println("Press 1 for Registration\nPress 2 for see Users Data\nPress 3 for Login\nPress 4 for Exit Game");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				Operation.getregistration();
				break;
			case 2:
				Operation.getUserData();
				break;
			case 3:
				Operation.getLogin();
				break;
			case 4:
				b = false;
				break;
				
			}
					
		}

	}
	
	public static void main(String[] args) {
		Test.Start();
	}
	
}
