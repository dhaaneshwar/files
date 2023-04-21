package Q37;

public class Player {
	int requiredRuns;
	String summary;
	
    Player(int requiredRuns, String summary){
    	this.requiredRuns = requiredRuns;
    	this.summary = summary;
    }
    public void setRequiredRuns(int requiredRuns) {
    	this.requiredRuns = requiredRuns;
    }
    public void setSummary(String summary) {
    	this.summary = summary;
    }
    public int getRequiredRuns() {
    	return this.requiredRuns;
    }
    public String getSummary(){
    	return this.summary; 
    }
    public static void main(String[] args) throws Exception {
    	Player p=new Player(12,"123461");
		Match m=new Match();
		System.out.println(m.checkTarget(p).toLowerCase());
		System.out.println(m.results(p).toLowerCase());
	}
}