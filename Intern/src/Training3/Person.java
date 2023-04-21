package Training3;

public class Person {
	
	String name;
	String dateOfBirth;
	String email;
	
	public Person(String name,String dateOfBirth,String email){
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public static void main(String[] args) throws Exception {
		
		Person data = new Person("Steve", "12-02-1998", "Steve12@doselect.com");
		
		Implementation obj = new Implementation();

		String details="";
		try {
			details=obj.validator(data);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(details);

		System.out.println(obj.submitDetails(data));
	}

}
