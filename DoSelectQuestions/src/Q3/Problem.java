package Q3;

public class Problem {
	
	int credits;
	String type;
	public Problem(int credits, String type) {
		
		this.credits = credits;
		this.type = type;
	}
	public int getCredits() {
		return credits;
	}
	public String getType() {
		return type;
	}
	
	public static void main(String[] args) {
		Problem p=new Problem(41,"Exception");
		Checker c=new Checker();
		try {
			String s = c.checkProblem(p);
			System.out.println(s);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String t=c.approveProblem(p);
		System.out.println(t);
	}

}
