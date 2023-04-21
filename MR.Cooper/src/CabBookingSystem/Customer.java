package CabBookingSystem;

public class Customer {
	public static int curId;
	int CusId=0;
	String name;
	int age;
	String Address;
	int PhoneNo;
	
	Customer(String name,int age,String Address,int PhoneNo){
		this.CusId=CusId++;
		this.name=name;
		this.age=age;
		this.Address=Address;
		this.PhoneNo=PhoneNo;
		
	}

	@Override
	public String toString() {
		return "Customer [CustomerId="+ CusId +"name=" + name + ", age=" + age + ", Address=" + Address + ", PhoneNo=" + PhoneNo + "]";
	}
	
	
}
