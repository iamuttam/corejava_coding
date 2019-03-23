//WAP input any number and check if it is prime or not.
package com;
import java.util.Scanner;
public class PrimeNo{
	int temp=0 ,i;
	Scanner scan=new Scanner(System.in);
	
	void compute(){
System.out.println("Enter the Number");
	int n=scan.nextInt();
	for(i=2;i<=n-1;i++){
	if(n%i==0){
		temp=temp+1;
	   }
	}
	if(temp==0){
	System.out.println(n+":is Prime no.");
	}
	else{
	System.out.println(n+":is not a prime no. ");
	}
	
      }
	public static void main(String[]args){
	PrimeNo p=new PrimeNo();
	p.compute();
}
}	
