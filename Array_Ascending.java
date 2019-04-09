package Array;
import java.util.Scanner;
public class Array_Ascending {
	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Element.");
		int n=sc.nextInt();
		System.out.println("Enter Elements.");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) 
		{
			for(int j=i+1; j<n; j++)
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Ascending Order.");
		for(int i=0;i<n-1;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println(a[n-1]);
	}
}
