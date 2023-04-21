package test;

import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int x=a,c=0;
		while(a>0) {
			int b=a%10;
			c=(c*10)+b;
			a/=10;
		}
		if(c==x) {
			System.out.println("It is a palindrome number");
		}else {
			System.out.println("It is not a palindrome number");
		}
	}
}