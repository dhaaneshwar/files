package Q59;

import java.util.ArrayList;

class Recruitment{
	
	ArrayList<Company> companies;
	Student student=null;
	
	public String addStudent(String name,String branch,int age,int score) {
		return "";
	}
	
	public String addCompany(Company company) {
		if(!companies.contains(company)) {
			companies.add(company);
			return "Recurting";
		}else {
			if(company.isDrive()==true) {
				
				return "Already Recurted";
			}else {
				for(Company c:companies) {
					if(c.getName().equals(company.getName())){
						companies.set(companies.indexOf(c.getName()), company);
					}
				}
				return "Details Modified";
			}
		}
		
		
	}
	
	public String eligibleCompanies(Company company) {
		
		return "";
	}
	
	public int passedOnlineTest(int score) {
		return 0;
	}
	
	public int laggingScore(int value) {
		return 0;
	}
}