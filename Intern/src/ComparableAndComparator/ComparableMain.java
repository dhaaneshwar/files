package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Marks implements Comparable<Marks>{
	
	int student;
	int mark;
	
	public Marks(int student,int mark) {
		this.student=student;
		this.mark=mark;
	}
	
	public int compareTo(Marks other) {
		return (int)(this.getMark()-other.getMark());
	}

	public int getStudent() {
		return student;
	}

	public int getMark() {
		return mark;
	}

	
	
	
	
}


public class ComparableMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Marks> list=new ArrayList<Marks>();
		ArrayList<Marks> list1=new ArrayList<Marks>();
		
		
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int totalMark=0;
		
		System.out.println("Enter the marks");
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			totalMark+=x;
			list.add(new Marks(i,x));
		}
		list1.addAll(list);
		
		Collections.sort(list);
		
		System.out.println("Highest mark: "+list.get(n-1).getMark());
		System.out.println("Average marks: "+(double)totalMark/n);
		
		System.out.print("Marks: ");
		for(Marks m:list1) {
			System.out.print(m.getStudent()+"-"+m.getMark()+" ");
		}
		System.out.println();
		
		System.out.println("3rd student mark: "+list.get(2).getMark());
		System.out.print("Sorted: ");
		for(int i=0;i<n;i++) {
			System.out.print((i+1)+"-"+list.get(i).getMark()+" ");
		}
		

	}

}