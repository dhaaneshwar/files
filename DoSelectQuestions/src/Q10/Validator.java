package Q10;

public class Validator {
	public static int total=0;
	
	public String validateScore(Student s) throws Exception{
		
		int arr[]=s.getScore();
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
			if(arr[i]<=0 || arr[i]>100) {
				throw new InvalidScoreException("Invalid score");
			}
		}
		return "Valid score";
	}
	
	public double getPercentage(Student s) {
		double percentage=total/s.getScore().length;
		
		if(percentage>=33) {
			s.setStatus("Pass");
		}else {
			s.setStatus("Fail");
		}
		
		String str;
		try {
			str = validateScore(s);
			return percentage;
		} catch (Exception e) {
			return 0.0;
		}
		
	}

}
