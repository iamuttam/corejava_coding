import java.util.Scanner;
class Digit{
	Scanner scan=new Scanner(System.in);
	int count=0,n;
	void input(){
	System.out.println("Enter your Number");
	n=scan.nextInt();
	while(n>0){
	n=n/10;
	count++;
	}
	System.out.println("Number of Digits:-"+count);
      }
    	
public static void main(String[]args){
	Digit d=new Digit();
	d.input();

}
}

