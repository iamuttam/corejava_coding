package Array;

import java.util.Scanner;

public class Array_Delete {

	public static void main(String[] args) {
		int flag=1,loc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of element you want.");
		int n=sc.nextInt();
		System.out.println("Enter the Elements.");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Element you want to Delete.");
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				loc=i;
				break;
			}else {
				flag=0;
			}
		}
		if(flag==1) {
			for(int i=loc+1;i<n;i++) {
				a[i-1]=a[i];
			}
			System.out.println("After Delete Element.");
			for(int i=0;i<n-2;i++) {
				System.out.print(a[i]+",");
			}
			System.out.println(a[n-2]);
		}else {
			System.out.println("Element Not Found.");
		}
		sc.close();
	}
}
