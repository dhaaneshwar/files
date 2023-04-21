package Q40;

import java.util.regex.*;

public class Validator {
	
	public String checkEmail(Email email) throws Exception{
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(email.getUsername());
        boolean specialCharacter = matcher.find();
        if(!specialCharacter)
        	throw new EmailException("Invalid Username");
        String d=email.getDomain();
        
        if(!d.equals("outlook") && !d.equals("gmail") && !d.equals("hotmail") && !d.equals("godaddy")) {
        	throw new EmailException("Invalid domain");
        }
		return "Continue";
	}
	
	public String signIn(Email email) throws Exception{
		try {
			checkEmail(email);
		}catch(EmailException e) {
			return "Failed";
		}catch(Exception e) {
			return "Other Exception";
		}
		return "Signed in";
	}

}
