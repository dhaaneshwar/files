package Covid19;

class User{
	 String userEmail;
	 String userName;
	 int zoneId; int streetId;
	 
	 User(String email, String name, int zoneId, int streetId){
	 this.userEmail = email;
	 this.userName = name;
	 this.zoneId = zoneId;
	 this.streetId = streetId;
	 }
	 
	 public String toString(){
	 return "[ userEmail: "+ this.userEmail + ", userName: "+ this.userName+ ", zoneId: "+ this.zoneId + ", streetId: "+
	this.streetId +" ]";
	 }
	}