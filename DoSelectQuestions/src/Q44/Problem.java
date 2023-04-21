package Q44;

public class Problem {
	int credits;
    String type;
	public Problem(int credits, String type) {
		super();
		this.credits = credits;
		this.type = type;
	}
	public int getCredits() {
		return credits;
	}
	public String getType() {
		return type;
	}
	public static void main(String[] args) throws Exception {
		Problem p=new Problem(41,"Exception");
		Checker c=new Checker();
		String s = c.checkProblem(p);
		String t=c.approveProblem(p);
		System.out.println(s+"\n"+t);
	}
}
