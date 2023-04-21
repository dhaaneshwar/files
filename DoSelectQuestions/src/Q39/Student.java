package Q39;

public class Student {
	String name;
	int score;
	Student(String name , int score){
		this.name = name;
		this.score = score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}
	public static void main(String[] args) {
	    Student s1=new Student("A",6);
		Classroom cm=new Classroom();
		System.out.println( cm.registerStudent(s1));
		System.out.println( cm.studentCard(s1.getName()));
	}
}
