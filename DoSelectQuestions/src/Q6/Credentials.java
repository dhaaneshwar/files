package Q6;

public class Credentials {
	String userName;
	String password;

	public Credentials(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public static void main(String[] args) throws Exception {
		Implementation obj = new Implementation();
		
		System.out.println(obj.passwordValidator(new Credentials("Steve", "Akjsdhhj@1")));;
		System.out.println(obj.signUp(new Credentials("Bob", "jsdhJS12*&$1")));

	}

}
