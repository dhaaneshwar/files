package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sorts list of students based on the length
class Student implements Comparable<Student> {
	
	String name;
	int rollno;
	
	public Student( int rollno,String name) {
		
		this.name = name;
		this.rollno = rollno;
	}
	//Sorts list of students based on the length
	public int compareTo(Student o) {
		return (int)(this.getName().length()-o.getName().length());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
	
	public class ComparableMain{
		public static void main(String[] args) {
			
			ArrayList<Student> stu=new ArrayList<Student>();
	        stu.add(new Student(1,"xyza"));
	        stu.add(new Student(9,"abc"));
	        stu.add(new Student(5,"pq"));
	        stu.add(new Student(3,"l"));
	        
	        //Sorts list of students based on the length 
	        Collections.sort(stu);
	        
	        for (Student i: stu)
	        {
	            System.out.println(i.getName() + " " +i.getRollno());
	        }
		}
	}
	



