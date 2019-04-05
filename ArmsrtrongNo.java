package interview;

import java.util.Scanner;

public class ArmsrtrongNo {
		    public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter the Number");
		    int n=scan.nextInt();
		    /*int temp, total = 0;	        
	        int number = n;
	        while (number!=0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp*temp;
	            number =number/ 10;
  	        }
            */
		    int a=n/1000;
		    int b=(n%1000)/100;
		    int c=(n%100)/10;
		    int d=(n%10);
		    int total=a*a*a*a+b*b*b*b+c*c*c*c+d*d*d*d;
	        if(total == n)
	            System.out.println(n + " is an Armstrong number");
	        else
	            System.out.println(n + " is not an Armstrong number");
	    }
	}