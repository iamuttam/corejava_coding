package com;
import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
    System.out.println(A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())?"Yes":"No");
          
        
    }
}


