package interview;

import java.util.Scanner;

public class Factorial {
	int fact=1;
	Scanner scan=new Scanner(System.in);
	void fact() {
		System.out.println("Enter the no:-");
		int n=scan.nextInt();
/*		int i=n;
		while(i>0) {
			fact=fact*i;
			--i;
		}*/
		for(int i=n;i>0;i--) {
			fact=i*fact;
		}
		System.out.println("Factorial of "+n+"="+fact);
	}
	public static void main(String[] args) {
	Factorial f=new Factorial();
	f.fact();
	}
}
