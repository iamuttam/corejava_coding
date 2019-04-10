package Array;
import java.util.Scanner;
public class SortNameinAlphabetic {

	public static void main(String[] args) {
		String temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No of Elements.");
		int n=s.nextInt();
		String name[]=new String[n];
		System.out.println("Enter the Elements");
		String s1=s.next();
		for(int i=0;i<n;i++) {
			name[i]=s.next();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(name[i].compareTo(name[j])>0) {
					temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
				}
			}
		}
		System.out.println("Name in Sorted Order:");
		for(int i=0;i<n-1;i++) {
			System.out.print(name[i]+",");
		}
		System.out.println(name[n-1]);
		

	}

}
