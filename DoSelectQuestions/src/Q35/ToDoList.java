package Q35;

import java.util.*;

class ToDoList{
	List<Task> tasks=new ArrayList<>();
	public String addTask(Task t) throws Exception{
		if(t.getHours()<1||t.getHours()>24)
			throw new TaskException("Invalid time");
		 
		if(tasks.contains(t))
			throw new TaskException("Already present");
		tasks.add(t);
		
		return "Task will be completed";
	}
	public String completeTask(Task t) throws Exception{
		try {
			addTask(t);
		}
		catch(TaskException e) {
			return "Task incomplete";
		}
		catch(Exception e) {
			return "Other exception";
		}
		return "Task completed";
	}
}
