package Q20;

import java.util.*;

public class Merit {
	HashMap<String,ArrayList<Student>> mlist=new HashMap<>();
	ArrayList<String> stu=new ArrayList<>();
	
	public String newEntry(Student s,String university) {

		if(mlist.containsKey(university)) {
			
			mlist.get(university).add(s);
			return "Student added";
		}
		else {
			mlist.put(university,new ArrayList<Student>());
			mlist.get(university).add(s);
			
			return "University added";
		}

		
	}
	
	public ArrayList<String> getStudents(String university) {
		ArrayList<Student> a=mlist.get(university);
		ArrayList<String> s=new ArrayList<>();
		
		for(Student i:a) {
			s.add(i.getStu_name());
		}
		return s;
	}

}
