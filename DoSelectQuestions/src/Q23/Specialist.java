package Q23;

import java.math.BigDecimal;
import java.util.*;

enum Specialty{
	ENGINEER,
	MANAGER,
	DEVOPS;
}

public class Specialist {
	String name;
	BigDecimal salary;
	Specialty specialty;

	public Specialist(String name, BigDecimal salary, Specialty specialty) {
		super();
		this.name = name;
		this.salary = salary;
		this.specialty = specialty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Specialist [name=" + name + ", specialty=" + specialty + "]";
	}

	public static void main(String[] args) {
		
		List<Specialist> list = Arrays.asList(
				new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER),
				new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS),
				new Specialist("Petr Petrov", new BigDecimal(10000), Specialty.MANAGER));
		Implementation implementation=new Implementation();
		System.out.println(implementation.filterBySpeciality(list,Specialty.ENGINEER));
		System.out.println(implementation.sortSpecialistsByNameAsc(list));
	}

}
