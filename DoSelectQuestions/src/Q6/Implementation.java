package Q6;
import java.util.regex.*;

public class Implementation {
	public String passwordValidator(Credentials credentials) throws Exception {
		
		String password=credentials.getPassword();
		String regex = "^(?=.*[a-z])(?=."+ "*[A-Z])(?=.*\\d)"+ "(?=.*[-+_!@#$%^&*., ?]).+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		
		if(m.matches()==false) {
			
			throw new MissingCharacterException("password must contain at least one special character, at least one upper case alphabet, at least one lower case alphabet, and at least one digit");
			
		}else if(password.length()<8 || password.length()>40) {
			
			throw new LengthMismatchException("length of the password is not between 8 to 40");
		}
		return "valid password";
	}
	
	public String signUp(Credentials credentials) {
		try {
			passwordValidator(credentials);
			return "signup sucessfull";
		}catch(MissingCharacterException | LengthMismatchException e) {
			return "invalid password";
		} catch (Exception e) {
			
			return "other exception";
		}
		
	}
}
