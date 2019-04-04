package interview;

import java.util.Scanner;

public class AddDigit{
	int sum=0;
	Scanner scan=new Scanner(System.in);
	void add() {
		System.out.println("Enter the Number:");
		int n=scan.nextInt();
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}  
    public static void main(String []args) {
    AddDigit ad=new AddDigit();
    ad.add();
}
}
