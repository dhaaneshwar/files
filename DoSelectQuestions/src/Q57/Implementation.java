package Q57;

import java.util.*;
import java.util.stream.Collectors;

public class Implementation {
	public List<String> getFirstName(List<Lecturer> list){
		List<String> l=new ArrayList<>();
		for(Lecturer i:list) {
			l.add(i.getLecturerFirstName());
		}
		return l;
	}
	
	public double getMaxSalary(List<Lecturer> lecturerList) {
		List<Lecturer> sortedList = lecturerList.stream()
				.sorted(Comparator.comparingDouble(Lecturer::getSalary).reversed()).collect(Collectors.toList());
		return sortedList.get(0).getSalary();
	}

}
