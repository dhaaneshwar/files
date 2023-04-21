package Q57;

import java.util.*;

public class Lecturer {
	String lecturerFirstName;
	String lecturerLastName;
	int salary;

	public Lecturer(String lecturerFirstName, String lecturerLastName, int salary) {
		super();
		this.lecturerFirstName = lecturerFirstName;
		this.lecturerLastName = lecturerLastName;
		this.salary = salary;
	}

	public void setLecturerFirstName(String lecturerFirstName) {
		this.lecturerFirstName = lecturerFirstName;
	}

	public void setLecturerLastName(String lecturerLastName) {
		this.lecturerLastName = lecturerLastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLecturerFirstName() {
		return lecturerFirstName;
	}

	public String getLecturerLastName() {
		return lecturerLastName;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Lecturer [lecturerFirstName=" + lecturerFirstName + ", lecturerLastName=" + lecturerLastName
				+ ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Implementation i = new Implementation();
		List<Lecturer> list = new ArrayList<Lecturer>();
		list.add(new Lecturer("Alan", "D'costa", 500000));
		list.add(new Lecturer("Tom", "Sal", 1000000));
		list.add(new Lecturer("John", "Mirra", 360000));
		
		
		System.out.println(i.getMaxSalary(list));
		System.out.println(i.getFirstName(list));

	}

}
