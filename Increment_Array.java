package Array;

import java.util.Scanner;

public class Increment_Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No of Elements:");
	int n=sc.nextInt();
	System.out.println("Enter the Elements You Want in  Array.");
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		a[i]++; 
	}
	System.out.println("Elements of Array after increment by 1.");
	for(int i=0;i<n-1;i++) {
		System.out.print(a[i]+",");
	}
	System.out.println(a[n-1]);

	}

}
