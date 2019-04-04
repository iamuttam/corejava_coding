package interview;

public class MissingNo {
	public static void main(String[] args) {
		int a[]= {1,2,4,6,7,4};
		int b[]=new int[10];
		for(int i:a) {
			b[i]=1 ;
		}
		System.out.println("Missing No in Given Array");
		for(int i=1;i<10;i++) {
			if(b[i]==0) {
				System.out.println(i);
			}
		}
	  }
	}
