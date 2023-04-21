package Training2;

public class SalaryData {
	
	String name;
	int daysInMonth;
	double salary;

	public SalaryData(String name, int daysInMonth, double salary) {
		
		this.name = name;
		this.daysInMonth = daysInMonth;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getDaysInMonth() {
		return daysInMonth;
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		
		SalaryData s=new SalaryData("Steve",30,10000);
		Validator2 val=new Validator2();
		
		String ans="";
		
		try {
			ans=val.validSalaryData(s);
		} catch (Exception e) {
			ans=e.getMessage();
			
		}
		
		double sal=val.totalSalary(s);
		
		System.out.println(ans);
		
		System.out.println(sal);
		

	}

}
