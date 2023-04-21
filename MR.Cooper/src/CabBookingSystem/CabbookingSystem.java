package CabBookingSystem;
import java.util.*;
public class CabbookingSystem {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Customer> cus=new ArrayList<>();
		//boolean flag=true;
		System.out.println("Enter the details if you are new Customer press y else n");
		char c=sc.next().charAt(0);
		if(c=='y') {
			System.out.println("Press Q to exit");
			char str=sc.next().charAt(0);
			while(str!='Q') {
				System.out.println("Enter the name");
				String name=sc.next();
				System.out.println("Enter the age");
				int age=sc.nextInt();
				System.out.println("Enter the address");
				String address=sc.nextLine();
				System.out.println("Enter the Phone number");
				int PhNo=sc.nextInt();
				cus.add(new Customer(name,age,address,PhNo));
				
			}
			
			}
		else {
			
			
		}
		//passenger details
		
		ArrayList<Details> det=new ArrayList<>();
		for(int i=0;i<cus.size();i++) {
			System.out.println("Enter the PickUp Destination");
			String pickUp=sc.nextLine();
			System.out.println("Enter the drop Destinantion");
			String drop=sc.nextLine();
			System.out.println("enter the time of travel");
			int timeOftravel=sc.nextInt();
			System.out.println("Enter the no of Passengers");
			int noOfPassengers=sc.nextInt();
			System.out.println("Enter the time");
			int time=sc.nextInt();
			
			//cus.get(i);
			det.add(new Details(Customer.curId,cus.get(i).name,cus.get(i).PhoneNo,pickUp,drop,timeOftravel,noOfPassengers,time));
			
			
		}
		
		
		
		
		
		
		sc.close();

	}

}
