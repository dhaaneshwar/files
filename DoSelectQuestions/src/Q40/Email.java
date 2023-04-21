package Q40;

public class Email {
	
	String username;
	String domain;

	public Email(String username, String domain) {
		this.username = username;
		this.domain = domain;
	}

	public String getUsername() {
		return username;
	}

	public String getDomain() {
		return domain;
	}

	public static void main(String[] args) {
		Email e=new Email("Shoyab@","gmail");
		Validator v = new Validator();
		String s = null;
		try {
			s = v.checkEmail(e);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		String t = null;
		try {
			t = v.signIn(e);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println(s.toLowerCase());
		 System.out.println(t.toLowerCase());

	}



}
