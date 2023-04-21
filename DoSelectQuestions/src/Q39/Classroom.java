package Q39;

class Classroom{
	public String registerStudent(Student student) {
		String str=new String(student.getName());
		if(!(student.getName().toUpperCase().equals(str)))
			return "Block letters needed";
		if(student.getScore()<0 || student.getScore()>100)
			return "Invalid score";
		else
			return "Registered";
	}
	public String studentCard(String card) {
		int n=card.length();
		for (int i=0; i<n;i++) {
            if (!Character.isDigit(card.charAt(i))) 
                return "Invalid card";
	    }
		return "Valid card";
}
}
