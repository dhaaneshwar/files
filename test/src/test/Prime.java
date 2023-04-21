package test;

public class Prime {

	public static void main(String[] args) {
		
		int a=5;
		do {
			System.out.println(a);
			a--;
		}while(a>0);
		
		int n=12;
		int flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%2==0) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("\n"+n+" is a prime number");
		}else {
			System.out.println("\n"+n+" is not a prime number");
		}
		
		
		int x=123,y=0;
		while(x>0) {
			int b=x%10;
			y=(y*10)+b;
			x/=10;
		}
		System.out.println("\nReversed number : "+y);
	}

}
