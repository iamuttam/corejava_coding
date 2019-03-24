// WAP input number and check if it is a Palindrome or not
package com;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int n=sc.nextInt();
		int temp=n,rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)  
			System.out.println(n+":is a Palindrome Number.");
		else 
			System.out.println(n+":is not a Palindrome Number.");
		}
}
