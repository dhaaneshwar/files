package Q44;

class Checker{
	public String checkProblem(Problem p) throws Exception{
		if(p.getCredits()<10)
			return "Insufficient credits";
		if(p.getType().equals("String"))
			return "String problem found";
		if(p.getType().equals("Generic"))
			return "Generic problem found";
		if(p.getType().equals("I/O"))
			return "I/O problem found";
		return "Exception problem found";
		
	}
	public String approveProblem(Problem p) throws Exception{
		try {
			checkProblem(p);
		}
		catch(ProblemException e) {
			return "Not approved";
		}
		catch(Exception e) {
			return "Other exception";
		}
		return "Problem approved";
	}
}
