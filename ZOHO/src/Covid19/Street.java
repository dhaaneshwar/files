package Covid19;

class Street{
	 static int count = 0;
	 int streetId;
	 int zoneId;
	 String name;

	 Street(int zoneId, String name){
	 this.streetId = ++count;
	 this.zoneId = zoneId;
	 this.name = name;
	 }
	 
	 public String toString(){
	 return "[ zoneId: "+ this.zoneId + ", streetId: "+this.streetId+ ", name: "+ this.name+"]";
	 }
	}
