package interview;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayContain {
		public static void main(String[] args) {
		      String[] str = {"Java", "J2EE", "HTML", "CSS", "Python"};
		      System.out.println("enter the string to be found");
		      Scanner sc=new Scanner(System.in);
		     String find = sc.nextLine();
		      boolean found = Arrays.stream(str).anyMatch(t -> t.equals(find));
		      if(found)
		         System.out.println(find + " is found.");
		      else
		         System.out.println(find + " is not found.");
		}
	}


