//WAP to calculate the sum of Series s=1+1/2+1/3+1/4........till 10 terms.
package com;
public class Series {
	int count=1;
	float sum=0,j=1;
	void display(){
		for (count=1;count<=10;count++) {
			sum=sum+(1/j);
			j=j+1;
		}
		System.out.println("Sum of Series:s=1+1/2+1/3+1/4........till 10 terms="+sum);
	}

	public static void main(String[] args) {
	Series s=new Series();
	s.display();
	}

}
