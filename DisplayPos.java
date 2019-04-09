package Array;
import java.util.Scanner;
class DisplayPos{
	public static void main(String[]args){
	int i;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element how you want in Array.");
	 int n=sc.nextInt();
	System.out.println();
	for(i=0;i<n;i++){
	a[i]=sc.nextInt();
	System.out.println();
	}
	System.out.println("Enter the Position of Element.");
	i=sc.nextInt();
	System.out.println("a["+(i-1)+"]="+a[i-1]);
	}
}