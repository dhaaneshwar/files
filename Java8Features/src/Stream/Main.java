package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import exercise.Person;

public class Main {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
			);
		
		people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		long count= people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.count();
		
		//parallelStream increases the performance of the program..we can divide the code into multiple streams that are executed in parallel on separate cores 
		//and the final result is the combination of the individual outcomes
		long totalCount= people.parallelStream()
				.filter(p->p.getLastName().startsWith("C"))
				.count();
		System.out.println(count);
		
		IntStream.range(1,10).forEach(System.out::println);
		
		Stream.of("Ava","Aneri","Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		

	}

}
