package Q3;

public class Checker {
	
	public String checkProblem(Problem p) throws Exception{
		
		if(p.getCredits()<10) {
			throw new ProblemException("Insufficient credits");
		}
		if(p.getType().equals("String")) {
			throw new ProblemException("String problem found");
		}
		else if(p.getType().equals("Generic")) {
			throw new ProblemException("Generic problem found");
		}else if(p.getType().equals("I/O")) {
			throw new ProblemException("I/O problem found");
			
		}else {
			return "Exception problem found";
		}
		
		
	}
	
	public String approveProblem(Problem p) {
		
		try {
			checkProblem(p);
			return "Problem Approved";
		}catch(ProblemException e) {
			return "Not Approved";
		}catch(Exception e) {
			return "Other Exception";
		}
	}

}
