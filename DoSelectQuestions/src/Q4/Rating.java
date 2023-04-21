package Q4;

public class Rating {
	
	int imdbRating;
	int nominee;

	public Rating(int imdbRating, int nominee) {
		super();
		this.imdbRating = imdbRating;
		this.nominee = nominee;
	}

	public int getImdbRating() {
		return imdbRating;
	}

	public int getNominee() {
		return nominee;
	}
	public static void main(String[] args) {
		
		Rating rating = new Rating(9, 7);
		Validator v = new Validator();
		
		String s = "";
		try {
			s = v.canBeConsideredForTheAward(rating);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		String t="";
		try {
			t = v.sendInvite(rating);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());
		
	

}

//class Main{
//}
	
}
