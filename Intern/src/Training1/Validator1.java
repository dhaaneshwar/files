package Training1;

import java.util.regex.*;

public class Validator1 {
	
	public String validateCId(Customer c)
	{
		String mobile1 = c.getMobileNo();
		String first4Mobile = "";
		
		if(mobile1.length()>4)
		{
			first4Mobile = mobile1.substring(0,4);
		}
		
		String name1 = c.getName();
		String last2Name = "";
		
		if(name1.length()>2)
		{
			last2Name = name1.substring(name1.length()-2);
		}
		
		
		
		if((first4Mobile+last2Name).equals(c.getCId()))
		{
				return "Valid CID";
		}
		else
		{
			return "Invalid CID";
		}
		
		
		
	}
	
	public String validateMobileNo(Customer c)
	{
		
		Pattern ptrn = Pattern.compile("[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(c.getMobileNo());
		
		if(match.find() && match.group().equals(c.getMobileNo()))
		{
			return "Valid MobileNo";
		}
		else
		{
			return "Invalid MobileNo";
			
		}
		
	}

}