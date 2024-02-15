package com.jackpot;

import java.util.Random;
import java.util.Scanner;

public class Game {
	static User us = new User();
	public static double Play_Game() {
		Random rm = new Random();
		int b = rm.nextInt(1,4);
		System.out.println(b);
		
		System.out.println("Enter Your Number beetween 1to4");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==b) {
			System.out.println("You won 200.00Rs");
			return 200.0;
//			int Fund =(int) (us.getAmount()+ 200);
//			System.out.println("Your Fund is: "+Fund);
			
		}
			System.out.println("You lose 150Rs");
			return 0;

//			int Fund = (int)(us.getAmount()-150);
//			System.out.println(Fund);
//		
			}
}
