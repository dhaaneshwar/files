package Q20;

public class Student {
	String Stu_name;
	int score;

	public Student(String stu_name, int score) {
		
		Stu_name = stu_name;
		this.score = score;
	}

	public String getStu_name() {
		return Stu_name;
	}

	public int getScore() {
		return score;
	}

	public static void main(String[] args) {
		Merit obj=new Merit();
		Student s1=new Student("s1",100);
		Student s2=new Student("s2",100);
		System.out.println(obj.newEntry(s1, "IIT Bombay"));
		System.out.println(obj.newEntry(s2, "IIT Bombay"));
		System.out.println(obj.getStudents("IIT Bombay"));

	}


}
