package ComparableAndComparator;

import java.util.*;

public class TestPatientList{
	public static int getPatientAge(String name,TreeSet<Patient> tree) {
		
		for(Patient p:tree) {
			if(p.getName().equals(name)) {
				return p.getAge();
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		ArrayList<Patient> list=new ArrayList<Patient>();
		TreeSet<Patient> tree=new TreeSet<Patient>();
		
		
		
		list.add(new Patient(1,"fff",48));
		list.add(new Patient(2,"bbb",29));
		list.add(new Patient(3,"eee",20));
		
		Collections.sort(list);
		System.out.println("Sorted based on age: ");
		for(Patient p:list){
			System.out.println("Age: "+p.toString());
		}
		
		System.out.println("Sorted based on name :");
		Collections.sort(list,new SortByName());
		Iterator<Patient> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
		tree.addAll(list);
		System.out.println("Displaying from treeSet: ");
		for(Patient p:tree){
			System.out.println(p.toString());
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of a patient: ");
		String name=sc.next();
		System.out.println(getPatientAge(name, tree));
		
		
	}
}
