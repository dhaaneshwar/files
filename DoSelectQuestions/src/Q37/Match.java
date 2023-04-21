package Q37;

class Match{
	int requiredRuns;
 	char[] summary;	
    public String checkTarget(Player player) throws Exception{
    	requiredRuns = player.getRequiredRuns();
    	summary= player.getSummary().toCharArray();	
    	int totalruns=0;
    	for (char c:summary){
			if (Character.isDigit(c))
	            totalruns += Integer.parseInt(String.valueOf(c));;
			if(c=='W')
				throw new MatchException("Out");
		}
		if(totalruns<requiredRuns)
			throw new MatchException("Lost by runs");

		return "We may win"; 		
    }
    public String results(Player player) throws Exception
    {
    	try {
    		checkTarget(player);
    		return "We won";
    	}
    	catch(MatchException e){
    		return "We lost";
    	}
    	catch(Exception e) {
    		return "Other exception";
    	}
    }
 }