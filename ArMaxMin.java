package Array;
import java.util.Scanner;
class ArMaxMin{
	public static void main(String[]args){
	int max,min;
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();

	 int a[]=new int[n];

	for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
	}

	max=a[0];
	min=a[0];

	for(int i=0;i<n;i++){

	if(a[i]>max)
	max=a[i];	

	else if(a[i]< min)
	min=a[i];

	}
	System.out.println("Maximum Number is="+max);
	System.out.println("Minimum Number is="+min);	
	
}
}