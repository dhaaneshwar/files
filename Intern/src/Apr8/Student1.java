package Apr8;

// ***********************************COMPARATOR************************************
//The Comparator provides multiple sorting sequences

import java.util.*;
//import java.lang.*;
//import java.io.*;

public class Student1 {
	
	String name;
	int rollno;
	public Student1( int rollno,String name) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollno=" + rollno + "]";
	}

}

//Class to Compare by Rollno
class SortByRollNo implements Comparator<Student1>{
  public int compare(Student1 a,Student1 b) {
      return a.rollno-b.rollno;
  }
}

//Class to Compare By Name
class SortByName implements Comparator<Student1>{
  public int compare(Student1 a, Student1 b) {
      return (a.name).compareTo(b.name);
  }
}




