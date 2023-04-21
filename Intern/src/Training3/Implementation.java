package Training3;



public class Implementation {

	public String validator(Person p) throws Exception{
		
		String[] dob=p.getDateOfBirth().split("-");
		if(Integer.valueOf(dob[2])>2000) {
			
			throw new InvalidDateException("date year must be less than 2000");
			 
		}
		
		String domain=p.getEmail().substring(p.getEmail().length()-13,p.getEmail().length());
		if(domain.equals("@doselect.com")==false) {
			
			throw new InvalidEmailException("only @doselect.com domain email are accepted");
			
		}
		return "valid details";
	}
	
	

	public String submitDetails(Person p) {
		
		try {
			String details= validator(p);
			if(details.equals("valid details")) {
				return "Details submitted successfully";
			}
			
		}
		catch(InvalidDateException e1) {
			return "invalid details";
		}
		catch(InvalidEmailException e) {
			return "Invalid details";
		}
		catch (Exception e) {
			
			return "other exception";
		}
		
		return null;
	}
}
