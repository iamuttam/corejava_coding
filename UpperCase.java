package com;

import java.util.Scanner;
public class UpperCase {
		    public static void main(String[] args) {        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        int no=A.length()+B.length();
	        System.out.println (no);
	         System.out.println(A.compareTo(B) > B.compareTo(A) ? "Yes" : "No");
	        /*System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + 
	        		" " + B.substring(0, 1).toUpperCase() + B.substring(1));*/
	         System.out.println(A.substring(0, 1).toUpperCase() +A.substring(1) + 
		        		" " + B.substring(0, 1).toUpperCase()+B.substring(1) );
	       
	    }
	}





