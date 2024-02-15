package com.jackpot;

public class User {
	private String userName;
	private String pass;
	private double amount;
	public User(String userName, String pass) {
		super();
		this.setUserName(userName);
		this.setPass(pass);
	}
	public User() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void addAmount(double amount2) {
	this.amount += amount2;
		
	}
	
	
}
