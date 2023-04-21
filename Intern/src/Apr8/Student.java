package Apr8;

//      ****************************COMPARABLE***********************************
//Comparable provides a single sorting sequence

public class Student implements Comparable<Student>{
	private String name;
	private int cgpa;
	
	public Student(String name, int cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public int compareTo(Student o) {
		return (int)(this.getCgpa()-o.getCgpa());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCgpa() {
		return cgpa;
	}

	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}

	public static class ComparatorComparable{
		public static void main(String[] args) {
			Student s1=new Student("xyz",9);
			Student s2=new Student("abc",4);
			
			int result=s1.compareTo(s2);
			if(result>0) {
				System.out.println(s1.getName()+" has higher cgpa");
			}else if(result<0) {
				System.out.println(s2.getName()+" has higher cgpa");
			}else {
				System.out.println("Both have same cgpa");
			}
		}
	}

	
	

}
