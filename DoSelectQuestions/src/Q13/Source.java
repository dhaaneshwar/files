package Q13;

public class Source {

	public String handleException(Activity a) throws Exception {
		String s="";
		try {
			int l1=a.getString1().length();
			int l2=a.getString2().length();
			if(l1==0 || l2==0) {
				throw new NullPointerException("Null values found");
			}
			
		}catch(NullPointerException e) {
			return e.getMessage();
		}
		
		try {
			if(!(a.getOperator().equals("+")) && !(a.getOperator().equals("-"))) {
				throw new Exception(a.getOperator());
			}
//			return a.getOperator();
		}catch(Exception e) {
			return e.getMessage();
		}
		
		return "No exception found";
	}
	
	public String operate(Activity a) {
		
		switch(a.getOperator()) {
		case "+":
			return a.getString1()+a.getString2();
			
		case "-":
			return a.getString1().replace(a.getString1(), a.getString2());
			
		default:
			return "";
			
		}
		
	}

}
