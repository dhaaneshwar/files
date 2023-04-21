package Training2;



public class Validator2 {
	
	
	
	public String validSalaryData(SalaryData s) throws Exception {
		int day=s.getDaysInMonth();
		
		if(day!=30 && day!=31 && day!=29) {
			
//			System.out.println(s.getDaysInMonth());
			throw new InvalidDaysException("Invalid days");
		}
		
//		System.out.println(s.getSalary());
		if(s.getSalary()<=0 || s.getSalary()>1000000) {
			
			throw new InvalidSalaryException("Invalid salary");
		}
		
		return "Valid data";
	}
	
	public double totalSalary(SalaryData s)  {
		
		
		
			try {
				if(validSalaryData(s).equals("Valid data")) {
					return s.getSalary()*s.getDaysInMonth();
				}
			} catch (Exception e) {
				return 0.0;
			}
			
		
		return 0;
	}

}
