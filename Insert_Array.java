package Array;
import java.util.Scanner;
public class Insert_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Elements you want in Array.");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter all Elements.");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position where you want to insert the element.");
		int pos=sc.nextInt();
		System.out.println("Enter the the Element You Want to Insert.");
		int x=sc.nextInt();
		for(int i=(n-1);i>=(pos-1);i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("After Inserting.");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println(a[n]);
	}
}
