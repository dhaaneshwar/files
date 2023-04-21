package Q23;

import java.util.*;

public class Implementation {
	
	public List<Specialist> filterBySpeciality(List<Specialist> specialists, Specialty specialty){
		int n=specialists.size()-1;
		List<Specialist> list = new ArrayList<Specialist>();
		for(int i=0;i<n;i++) {
			if(specialists.get(i).getSpecialty()==specialty)
				list.add(specialists.get(i));
		}
		return list;
	}
	public List<Specialist> sortSpecialistsByNameAsc(List<Specialist> specialist){
		Collections.sort(specialist, Comparator.comparing(Specialist::getName));		

		return specialist;
	}
}
