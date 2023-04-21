package Virtusa;
import java.util.*;

public abstract class Car {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			WagnoR w=new WagnoR();
			int s=w.getSedan();
			int w=w.getSeat();
			
		}
		else if(n==2) {
			Inova i=new Inova();
		}
		else {
			HondaCity h=new HondaCity();
		}
		sc.close();

	}

}
