package Q36;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	String name;
    int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public static void main(String[] args) {
		Student s1=new Student("A",1);
		Student s2=new Student("B",2);
		Record record = new Record();
		System.out.println(record.addStudent(s1));
		System.out.println(record.swapRolls(s1,s2));
	}
}
