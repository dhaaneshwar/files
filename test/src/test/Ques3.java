package test;

import java.util.*;
public class Ques3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int tot=0,x=a;
		
		while(a>0) {
			int b=a%10;
			tot+=(b*b*b);
			a/=10;
		}
		
		if(x==tot) {
			System.out.println("It is a amstrong number");
			
		}else {
			System.out.println("It is not a amstrong number");
		}
	}
}