package Array;
import java.util.Scanner;
public class SpliteArray {

	public static void main(String[] args) {
		int loc=0,k=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements you Want in Array.");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position Where You want to split.");
		loc=sc.nextInt();
		for(int i=0;i<loc;i++) {
			b[k]=a[i];
			k++;
		}
		for(int i=loc;i<n;i++) {
			c[j]=a[i];
			j++;
		}
		System.out.print("First Array:");
		for(int i=0;i<k;i++) {
			System.out.print(b[i]+",");
		}
		System.out.println("");
		System.out.print("Second Array:");
		for(int i=0;i<j;i++) {
			System.out.print(c[i]+",");
		}
	}

}
