package Covid19;

class TestData{
	 static int count;
	 int requestId;
	 String userEmail;
	 int hospitalId;
	 boolean isInHome;
	 boolean isDone;
	 boolean isPositive;

	 TestData(String userEmail, int hospitalId, boolean isInHome){
	 this.requestId = ++count;
	 this.userEmail = userEmail;
	 this.hospitalId = hospitalId;
	 this.isInHome = isInHome;
	 this.isDone = false;
	 this.isPositive = false;
	 }
	 
	 public String toString(){
	 return "[ requestId: "+ requestId +", userEmail: "+this.userEmail + ", hospitalId: "+ this.hospitalId+ ", isInHome: "+ this.isInHome + ", isDone: "+ this.isDone +", isPositive; "+ isPositive+"]";
	 }
	}

