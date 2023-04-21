package Covid19;

class Zone{
	 static int count = 0;
	 int zoneId;
	 //private int activeCases;
	 int activeCases;
	 int recoveredCases;
	 int deceasedCases;
	 
	 Zone(){
	 zoneId = ++count;
	 activeCases = 0;
	 recoveredCases = 0;
	 deceasedCases = 0;
	 }
	 
	 public String toString(){
	 return "[ zoneId: "+ this.zoneId + ", activeCases: "+this.activeCases+ ", recoveredCases: "+ this.recoveredCases +", deceasedCases: "+ this.deceasedCases +"]";
	 }
	}