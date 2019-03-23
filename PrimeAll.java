//WAP print all the series of prime number between X and Y.
package com;
import java.util.Scanner;
public class PrimeAll {
	int i,j,temp;
	Scanner scan=new Scanner(System.in);
	void compute() {
		System.out.println("Enter Value for x:");
		int x=scan.nextInt();
		System.out.println("Enter Value for y:");
		int y=scan.nextInt();
		System.out.println("Prime no between "+x+" and "+y+":");
		for(i=x;i<=y;i++) {
			temp=0;
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					temp=1;
					break;
				}
			}
			if(temp==0)
			System.out.println(i);			
		}
		
	}
	public static void main(String[] args) {
		PrimeAll pa=new PrimeAll();
		pa.compute();

	}

}
