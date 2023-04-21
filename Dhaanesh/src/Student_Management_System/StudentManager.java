package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>();
		while (true) {
			System.out.println("----Welcome to the student management system----");
			System.out.println("1. Add student information");
			System.out.println("2. Modify student information");
			System.out.println("3. Delete student information");
			System.out.println("4. View all student information");
			System.out.println("5. Exit");
			System.out.println("Please enter options:");
			
			Scanner sc = new Scanner(System.in);
			int chose = sc.nextInt();
			switch (chose) {
			case 1: {
				Add(arr);
				break;
			}
			case 2: {
				Alter(arr);
				break;
			}
			case 3: {
				Remove(arr);
				break;
			}
			case 4: {
				Look(arr);
				break;
			}
			case 5: {
				System.out.println("Thank you for using");
				System.exit(0);
			}
			default:
				System.out.println("The options you entered are incorrect. Please try again.");
			}
			sc.close();
		}
		
	}

	// Add students
	public static void Add(ArrayList<Student> arr) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID:");
		String num = sc.next();
		//s.setNum(num);
		System.out.println("Enter name:");
		String name = sc.next();
		//s.setName(name);
		System.out.println("Enter age:");
		String age = sc.next();
		//s.setAge(age);
		System.out.println("Enter address:");
		String address = sc.next();
		//s.setAddress(address);
		Student s = new Student(num,name,age,address);
		arr.add(s);
		System.out.println("Student information added successfully!!");
		sc.close();
	}

	// modify student
	public static void Alter(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student ID of the student whose information needs to be modified:");
		String num = sc.next();
		System.out.println("Enter the student's new name:");
		String name = sc.next();
		System.out.println("Enter the student's new age:");
		String age = sc.next();
		System.out.println("Enter the student's new address:");
		String address = sc.next();
		Student news = new Student(num, name, age, address);

		for (int i = 0; i < arr.size(); i++) {
			Student s = arr.get(i);
			if (num.equals(s.getNum())) {
				arr.set(i, news);
			}
			sc.close();
		}
	}

	// View students
	public static void Look(ArrayList<Student> arr) {
		System.out.println("Student ID\tname\tage\taddress");
		if (arr.size() != 0) {
			for (int i = 0; i < arr.size(); i++) {
				Student s = arr.get(i);
				System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
			}
		} else {
			System.out.println("There is no student information!!!");
		}
	}

	// Remove student
	public static void Remove(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		if (arr.size() == 0) {
			System.out.println("Student information is empty, please add information");
		} else {
			System.out.println("Enter the student ID of the student to be removed:");
			String num = sc.next();
			for (int i = 0; i < arr.size(); i++) {
				Student s = arr.get(i);
				if (s.getNum().equals(num)) {
					arr.remove(i);
					System.out.println("Information removed successfully!!");

				} else {
					System.out.println("There is no such student, please try again");
				}
			}
			sc.close();
		}
	}
}
