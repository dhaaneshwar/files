package Q13;

public class Activity {
	String string1;
	String string2;
	String operator;

	public Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}

	public String getString1() {
		return string1;
	}

	public String getString2() {
		return string2;
	}

	public String getOperator() {
		return operator;
	}

	public static void main(String[] args) throws Exception {
		
		Activity act=new Activity("Hello","world","+");
		Source s=new Source();
		
		String s1=s.handleException(act);
		String s2=s.operate(act);
		
		System.out.println(s1);
		System.out.println(s2);

	}

	

}
