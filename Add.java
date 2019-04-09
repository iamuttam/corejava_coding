package Array;
import java.util.Scanner;
class Add{
	public static void main(String[]args){
	int sum=0;
	int a[]=new int[10];
		
	Scanner sc=new Scanner(System.in);
	
    for(int i=0;i<10;i++){
	 a[i]=sc.nextInt();
	
	sum=sum+a[i];
	}

	System.out.println("Sum of Array is="+sum);
}
}