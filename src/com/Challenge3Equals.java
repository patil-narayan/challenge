package com;

public class Challenge3Equals {
	
	public static void printEqual(int a,int b, int c) {
		
		if(a==b&&b==c){
			System.out.println("ALL Numbers are Equal");
			
		}
		else if ((a==b)||(a==c)||(c==b)) {
			System.out.println("Neither all are Equal or Different");
			
		}
		else {
			System.out.println("All numbers are Different");
		}
	}
	public static void main(String[] args) {
		printEqual(10,20,30);
	}

}
