package Stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {
	
	public static void main(String[] args) {
		 List<People> people = getPeople();
		 
		 people.forEach(System.out::println);

		 //filter
		 System.out.println("After filtering");
		 List<People> female= people.stream()
				 .filter(person->person.getGender().equals(Gender.FEMALE))
				 .collect(Collectors.toList());
		 female.forEach(System.out::println);
		 
		//sort
		 System.out.println("After sorting");
		 List<People> sorted=people.stream()
				 .sorted(Comparator.comparing(People::getAge).thenComparing(People::getGender).reversed())
				 .collect(Collectors.toList());
		 sorted.forEach(System.out::println);
		 
		 //AllMatch
		 System.out.print("All match: ");
		 boolean allMatch=people.stream()
				 .allMatch(person->person.getAge()>8);
		 System.out.println(allMatch);
		 
		 //Any match
		 System.out.print("Any match: ");
		 boolean anyMatch=people.stream()
				 .anyMatch(person->person.getAge()>8);
		 System.out.println(anyMatch);
		 
		 //None match
		 System.out.print("None match: ");
		 boolean noneMatch=people.stream()
				 .noneMatch(person->person.getAge()>8);
		 System.out.println(noneMatch);
		 
		 //Max
		 System.out.println("Maximum age");
		 people.stream()
		 .max(Comparator.comparing(People::getAge))
		 .ifPresent(System.out::println);
		 
		 //Min
		 System.out.println("Minimum age");
		 people.stream()
		 .min(Comparator.comparing(People::getAge))
		 .ifPresent(System.out::println);
		 
		 //Group
		 System.out.println("After grouping");
		 Map<Gender,List<People>> groupByGender=people.stream()
				 .collect(Collectors.groupingBy(People::getGender));
		 groupByGender.forEach((gender,people1) -> {
			 System.out.println(gender);
			 people1.forEach(System.out::println);
			 System.out.println();
		 });
		 
		 Optional<String> oldestFemaleAge = people.stream()
			        .filter(person -> person.getGender().equals(Gender.FEMALE))
			        .max(Comparator.comparing(People::getAge))
			        .map(People::getName);

			    oldestFemaleAge.ifPresent(System.out::println);
		
	}

	private static List<People> getPeople() {
		return List.of(
		        new People("Antonio", 20, Gender.MALE),
		        new People("Alina Smith", 33, Gender.FEMALE),
		        new People("Helen White", 57, Gender.FEMALE),
		        new People("Alex Boz", 14, Gender.MALE),
		        new People("Jamie Goa", 99, Gender.MALE),
		        new People("Anna Cook", 7, Gender.FEMALE),
		        new People("Zelda Brown", 120, Gender.FEMALE)
		    );
	}

}

