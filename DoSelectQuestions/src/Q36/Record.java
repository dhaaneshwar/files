package Q36;

import java.util.List;
import java.util.regex.*;

class Record{
	List<Student> students;
	public String addStudent(Student student) {
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(student.getName());
		if(matcher.find())
			return "Invalid name";
        return "Added";
	}
	public String swapRolls(Student s1, Student s2) {
		int a=s1.getRoll();
        s1.setRoll(s2.getRoll());
        s2.setRoll(a);
		return "Swapped";
	}
}
