package Q4;

public class Validator {
	
	public String canBeConsideredForTheAward(Rating rating) throws Exception{
		if(rating.getImdbRating()<7) {
			throw new MovieRatingException("Movie not eligible for Filmfare award");
		}
		if(rating.getNominee()<4) {
			throw new MovieRatingException("Minimum 4 nominee required");
		}
			return "Considered for the award";
		
	}
	
	public String sendInvite(Rating rating) throws Exception{
		try {
			canBeConsideredForTheAward(rating);
			return "Actors and Directors Invited";
		}catch(MovieRatingException e) {
			return "Not Invited";
		}catch(Exception e) {
			return "Other Exception";
		}
	}

}
