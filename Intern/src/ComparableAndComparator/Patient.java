package ComparableAndComparator;
import java.util.*;

//comparable and comparator

public class Patient implements Comparable<Patient>{
	
	private int patientId;
	private String name;
	private int age;

	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Patient other) {
		return (int)(this.getAge()-other.getAge());
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

class SortByName implements Comparator<Patient>{
	  public int compare(Patient a, Patient b) {
	      return (a.getName()).compareTo(b.getName());
	  }
	}


