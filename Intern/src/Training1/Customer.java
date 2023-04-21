package Training1;

public class Customer {
	
	Customer()
	{
		
	}
	
	String name;
	String mobileNo;
	String cId;
	
	Customer(String name, String mobileNo, String cId)
	{
		this.name = name;
		this.mobileNo = mobileNo;
		this.cId = cId;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getMobileNo()
	{
		return this.mobileNo;
	}
	public String getCId()
	{
		return this.cId;
	}

}