package interview;
import java.util.Scanner;
class SwapNo{
	Scanner scan=new Scanner(System.in);
	void cal()
	{
		System.out.println("Enter Value of a:");
		int a=scan.nextInt();
		System.out.println("Enter Value of b:");
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a+"\t"+"b:"+b);
		
	}
	public static void main(String s[]){
	SwapNo sn=new SwapNo();
	sn.cal();
	}
}
