package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		
		List<Person> people=Arrays.asList(
			new Person("Charles","Dickens",60),
			new Person("Lewis","Carroll",42),
			new Person("Thomas","Carlyle",51),
			new Person("Charlotte","Bronte",45),
			new Person("Matthew","Arnold",39)
		);
		
		Collections.sort(people , (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		
		System.out.println("Print all persons");
		printConditionally(people, p->true);
//		printAll(people);
		
		System.out.println("First name begines with \"C\"");
		printConditionally(people, p -> p.getFirstName().startsWith("C") );
		
		System.out.println("Last name beginnes with \"C\"");
		printConditionally(people,p -> p.getLastName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p:people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println(p);
		}
		
	}
	
	interface Condition{
		boolean test(Person p);
	}

}
