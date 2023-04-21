package Q33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Implementation{
	public List<Person> filterListByBirth(List<Person> persons){
		List<Person> persons1=new ArrayList<>(persons);
		Collections.sort(persons1, Comparator.comparing(Person::getBirthDate));
		return persons1;
	}
	public List<Person> limitSkipAndReturn(List<Person> persons,int pageNumber,int pageSize){
		List<Person> list=new ArrayList<>();
		int temp1=pageNumber*pageSize;
		int temp2=0;
		for(int i=temp1;i<persons.size();i++) {
			if(temp2==temp1)
				return list;
			list.add(persons.get(i));
			temp2++;
		}
		return list;
	}
}
