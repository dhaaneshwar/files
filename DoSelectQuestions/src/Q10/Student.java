package Q10;

public class Student {
	
	String name;
	int[] score;
	String status;

	public Student(String name, int[] score) {
		
		this.name = name;
		this.score = score;
		
	}

	public String getName() {
		return name;
	}

	public int[] getScore() {
		return score;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void main(String[] args) throws Exception {
		int score[] = {10,40,80,67,69};
		Student s = new Student("Aman",score);
		Validator val = new Validator();
		try {
			System.out.println(val.validateScore(s));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			System.out.println(val.getPercentage(s));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
