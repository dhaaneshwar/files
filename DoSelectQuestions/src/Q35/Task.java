package Q35;

import java.util.ArrayList;
import java.util.List;

public class Task {
	String name;
	int hours;
	public Task(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public int getHours() {
		return hours;
	}
	public static void main(String[] args) throws Exception {
		Task t= new Task("Gym",12);
		
		ToDoList lst=new ToDoList();
		String t1=lst.addTask(t);
        System.out.println(t1.toLowerCase());
        Task tt=new Task("abc",13);
        System.out.println(lst.completeTask(tt));
	}
}