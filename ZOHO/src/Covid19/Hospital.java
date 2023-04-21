package Covid19;

class Hospital{
	 static int count = 0;
	 int hospitalId;
	 String hospitalName;
	 boolean isCovidFacilities;
	 int zoneId;
	
	 Hospital(String hospitalName, boolean isCovidFacilities,int zoneId){
	 this.hospitalId = ++count;
	 this.hospitalName = hospitalName;
	 this.isCovidFacilities = isCovidFacilities;
	 this.zoneId = zoneId;
	 }
	 
	 public String toString(){
	 return "[ zoneId: "+ this.zoneId + ", hospitalId: "+this.hospitalId+ ", name: "+ this.hospitalName+", isCovidFacilities: "+isCovidFacilities+"]";
	 }
}